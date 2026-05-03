package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Angle: ImageVector
    get() {
        if (_angle != null) return _angle!!
        _angle = phosphorDuotoneIcon(
            name = "Angle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 200.000 168.000 L 200.000 200.000 L 72.000 200.000 L 72.000 72.000 L 104.000 72.000 C 157.019 72.000 200.000 114.981 200.000 168.000 Z"),
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
                pathData = parseSvgPathData("M 96.000 72.000 C 96.000 67.582 99.582 64.000 104.000 64.000 C 161.412 64.061 207.939 110.588 208.000 168.000 C 208.000 172.418 204.418 176.000 200.000 176.000 C 195.582 176.000 192.000 172.418 192.000 168.000 C 191.945 119.422 152.578 80.055 104.000 80.000 C 99.582 80.000 96.000 76.418 96.000 72.000 ZM 240.000 192.000 L 80.000 192.000 L 80.000 32.000 C 80.000 27.582 76.418 24.000 72.000 24.000 C 67.582 24.000 64.000 27.582 64.000 32.000 L 64.000 64.000 L 32.000 64.000 C 27.582 64.000 24.000 67.582 24.000 72.000 C 24.000 76.418 27.582 80.000 32.000 80.000 L 64.000 80.000 L 64.000 200.000 C 64.000 204.418 67.582 208.000 72.000 208.000 L 240.000 208.000 C 244.418 208.000 248.000 204.418 248.000 200.000 C 248.000 195.582 244.418 192.000 240.000 192.000 Z"),
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
        return _angle!!
    }

private var _angle: ImageVector? = null
