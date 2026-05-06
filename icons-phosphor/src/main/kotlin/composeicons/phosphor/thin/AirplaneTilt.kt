package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.AirplaneTilt: ImageVector
    get() {
        if (_airplaneTilt != null) return _airplaneTilt!!
        _airplaneTilt = phosphorThinIcon(
            name = "AirplaneTilt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M180.67 113.1 211.72 83.87l.09-.08c10.935-10.935 10.935-28.665 0-39.6-10.935-10.935-28.665-10.935-39.6 0l-.08 .09L142.9 75.33 57.37 44.23c-1.462-.533-3.1-.17-4.2 .93L29.17 69.16c-.849 .847-1.272 2.031-1.154 3.224 .118 1.193 .766 2.271 1.764 2.936l68 45.29L78.35 140h-22.35c-1.063 .002-2.081 .426-2.83 1.18l-24 24c-.95 .95-1.359 2.314-1.089 3.63 .27 1.316 1.182 2.409 2.429 2.91l38.42 15.36 15.34 38.37v.09c.518 1.25 1.632 2.153 2.962 2.401 1.33 .248 2.695-.192 3.628-1.171l23.93-23.93c.767-.747 1.203-1.77 1.21-2.84v-22.35l19.38-19.38 45.29 67.95c.665 .998 1.742 1.646 2.936 1.764 1.193 .118 2.377-.305 3.224-1.154l24-24c1.1-1.1 1.463-2.738 .93-4.2ZM184.67 217.72 139.38 149.78c-.671-1.016-1.768-1.671-2.98-1.78h-.39c-1.063 .002-2.081 .426-2.83 1.18l-24 24c-.751 .747-1.176 1.761-1.18 2.82v22.34L89.47 216.88 75.72 182.51c-.407-1.017-1.213-1.823-2.23-2.23L39.12 166.53 57.66 148h22.34c1.061 .001 2.079-.42 2.83-1.17l24-24c.849-.847 1.272-2.031 1.154-3.224-.118-1.193-.766-2.271-1.764-2.936L38.28 71.37 57 52.62l85.61 31.13c1.498 .551 3.181 .158 4.28-1l31-32.93c7.807-7.818 20.472-7.827 28.29-.02 7.818 7.807 7.827 20.472 .02 28.29l-32.93 31c-1.158 1.099-1.551 2.782-1 4.28L203.38 199Z"),
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
        return _airplaneTilt!!
    }

private var _airplaneTilt: ImageVector? = null
