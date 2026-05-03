package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.FirstAid: ImageVector
    get() {
        if (_firstAid != null) return _firstAid!!
        _firstAid = phosphorDuotoneIcon(
            name = "FirstAid",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 224.000 104.000 L 224.000 152.000 C 224.000 156.418 220.418 160.000 216.000 160.000 L 160.000 160.000 L 160.000 216.000 C 160.000 220.418 156.418 224.000 152.000 224.000 L 104.000 224.000 C 99.582 224.000 96.000 220.418 96.000 216.000 L 96.000 160.000 L 40.000 160.000 C 35.582 160.000 32.000 156.418 32.000 152.000 L 32.000 104.000 C 32.000 99.582 35.582 96.000 40.000 96.000 L 96.000 96.000 L 96.000 40.000 C 96.000 35.582 99.582 32.000 104.000 32.000 L 152.000 32.000 C 156.418 32.000 160.000 35.582 160.000 40.000 L 160.000 96.000 L 216.000 96.000 C 220.418 96.000 224.000 99.582 224.000 104.000 Z"),
                    pathFillType = PathFillType.NonZero,
                    fill = SolidColor(Color(0xFF000000)),
                    fillAlpha = 1f,
                    stroke = null,
                    strokeAlpha = 1f,
                    strokeLineWidth = 0f,
                    strokeLineCap = StrokeCap.Butt,
                    strokeLineJoin = StrokeJoin.Miter,
                )
            }
            addPath(
                pathData = parseSvgPathData("M 216.000 88.000 L 168.000 88.000 L 168.000 40.000 C 168.000 31.163 160.837 24.000 152.000 24.000 L 104.000 24.000 C 95.163 24.000 88.000 31.163 88.000 40.000 L 88.000 88.000 L 40.000 88.000 C 31.163 88.000 24.000 95.163 24.000 104.000 L 24.000 152.000 C 24.000 160.837 31.163 168.000 40.000 168.000 L 88.000 168.000 L 88.000 216.000 C 88.000 224.837 95.163 232.000 104.000 232.000 L 152.000 232.000 C 160.837 232.000 168.000 224.837 168.000 216.000 L 168.000 168.000 L 216.000 168.000 C 224.837 168.000 232.000 160.837 232.000 152.000 L 232.000 104.000 C 232.000 95.163 224.837 88.000 216.000 88.000 ZM 216.000 152.000 L 160.000 152.000 C 155.582 152.000 152.000 155.582 152.000 160.000 L 152.000 216.000 L 104.000 216.000 L 104.000 160.000 C 104.000 155.582 100.418 152.000 96.000 152.000 L 40.000 152.000 L 40.000 104.000 L 96.000 104.000 C 100.418 104.000 104.000 100.418 104.000 96.000 L 104.000 40.000 L 152.000 40.000 L 152.000 96.000 C 152.000 100.418 155.582 104.000 160.000 104.000 L 216.000 104.000 Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _firstAid!!
    }

private var _firstAid: ImageVector? = null
