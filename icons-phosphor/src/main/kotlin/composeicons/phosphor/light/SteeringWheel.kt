package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.SteeringWheel: ImageVector
    get() {
        if (_steeringWheel != null) return _steeringWheel!!
        _steeringWheel = phosphorLightIcon(
            name = "SteeringWheel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 26C71.667 26 26 71.667 26 128c0 56.333 45.667 102 102 102 56.333 0 102-45.667 102-102C229.934 71.694 184.306 26.066 128 26ZM46.43 166h44c.833 .001 1.578 .519 1.87 1.3l18.33 49C82.446 210.703 58.608 192.026 46.43 166ZM145.3 216.32l18.37-49c.293-.784 1.043-1.303 1.88-1.3h44c-12.187 26.04-36.046 44.719-64.25 50.3ZM214.17 154h-48.62c-5.838 0-11.063 3.623-13.11 9.09l-20.55 54.82c-1.29 .06-2.59 .09-3.89 .09-1.3 0-2.63 0-3.94-.09L103.56 163.1C101.502 157.64 96.285 154.019 90.45 154h-48.62c-.65-2.17-1.23-4.37-1.72-6.61C63.108 123.501 94.84 110.003 128 110.003c33.16 0 64.892 13.498 87.89 37.387-.49 2.24-1.07 4.44-1.72 6.61ZM128 98c-33.211 .043-65.23 12.383-89.88 34.64C38 131.1 38 129.56 38 128 38 78.294 78.294 38 128 38c49.706 0 90 40.294 90 90 0 1.56 0 3.1-.12 4.64C193.23 110.383 161.211 98.043 128 98ZM138 140c0 5.523-4.477 10-10 10-5.523 0-10-4.477-10-10 0-5.523 4.477-10 10-10 5.523 0 10 4.477 10 10Z"),
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
        return _steeringWheel!!
    }

private var _steeringWheel: ImageVector? = null
