package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.CornersIn: ImageVector
    get() {
        if (_cornersIn != null) return _cornersIn!!
        _cornersIn = phosphorDuotoneIcon(
            name = "CornersIn",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 208.000 64.000 L 208.000 192.000 C 208.000 200.837 200.837 208.000 192.000 208.000 L 64.000 208.000 C 55.163 208.000 48.000 200.837 48.000 192.000 L 48.000 64.000 C 48.000 55.163 55.163 48.000 64.000 48.000 L 192.000 48.000 C 200.837 48.000 208.000 55.163 208.000 64.000 Z"),
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
                pathData = parseSvgPathData("M 152.000 96.000 L 152.000 48.000 C 152.000 43.582 155.582 40.000 160.000 40.000 C 164.418 40.000 168.000 43.582 168.000 48.000 L 168.000 88.000 L 208.000 88.000 C 212.418 88.000 216.000 91.582 216.000 96.000 C 216.000 100.418 212.418 104.000 208.000 104.000 L 160.000 104.000 C 155.582 104.000 152.000 100.418 152.000 96.000 ZM 96.000 152.000 L 48.000 152.000 C 43.582 152.000 40.000 155.582 40.000 160.000 C 40.000 164.418 43.582 168.000 48.000 168.000 L 88.000 168.000 L 88.000 208.000 C 88.000 212.418 91.582 216.000 96.000 216.000 C 100.418 216.000 104.000 212.418 104.000 208.000 L 104.000 160.000 C 104.000 155.582 100.418 152.000 96.000 152.000 ZM 208.000 152.000 L 160.000 152.000 C 155.582 152.000 152.000 155.582 152.000 160.000 L 152.000 208.000 C 152.000 212.418 155.582 216.000 160.000 216.000 C 164.418 216.000 168.000 212.418 168.000 208.000 L 168.000 168.000 L 208.000 168.000 C 212.418 168.000 216.000 164.418 216.000 160.000 C 216.000 155.582 212.418 152.000 208.000 152.000 ZM 96.000 40.000 C 91.582 40.000 88.000 43.582 88.000 48.000 L 88.000 88.000 L 48.000 88.000 C 43.582 88.000 40.000 91.582 40.000 96.000 C 40.000 100.418 43.582 104.000 48.000 104.000 L 96.000 104.000 C 100.418 104.000 104.000 100.418 104.000 96.000 L 104.000 48.000 C 104.000 43.582 100.418 40.000 96.000 40.000 Z"),
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
        return _cornersIn!!
    }

private var _cornersIn: ImageVector? = null
