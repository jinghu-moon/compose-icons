package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FireSimple: ImageVector
    get() {
        if (_fireSimple != null) return _fireSimple!!
        _fireSimple = phosphorThinIcon(
            name = "FireSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M140.82 20.92c-1.001-.83-2.343-1.121-3.598-.781-1.255 .34-2.266 1.269-2.712 2.491L110.36 88.83 81.81 61.13c-.821-.809-1.951-1.224-3.1-1.14-1.149 .084-2.206 .66-2.9 1.58C54.71 89.25 44 117 44 144c0 46.392 37.608 84 84 84 46.392 0 84-37.608 84-84C212 86.24 162.22 38.69 140.82 20.92ZM128 220C86.045 219.956 52.044 185.955 52 144 52 119.93 61.25 95.07 79.5 70l29.71 28.83c.973 .947 2.36 1.336 3.683 1.033 1.324-.303 2.403-1.257 2.867-2.533L140.06 30.73C162.27 50.09 204 93.18 204 144c-.044 41.955-34.045 75.956-76 76Z"),
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
        return _fireSimple!!
    }

private var _fireSimple: ImageVector? = null
