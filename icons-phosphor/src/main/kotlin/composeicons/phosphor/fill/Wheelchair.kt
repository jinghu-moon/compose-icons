package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Wheelchair: ImageVector
    get() {
        if (_wheelchair != null) return _wheelchair!!
        _wheelchair = phosphorFillIcon(
            name = "Wheelchair",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M250.53 199.59l-24 8c-3.775 1.263-7.905-.441-9.69-4L187.05 144h-83.05c-4.418 0-8-3.582-8-8v-29.66c-26.636 7.952-43.408 34.239-39.394 61.745C60.619 195.592 84.202 215.991 112 216c25.91 0 50.09-18.05 56.25-42 1.105-4.28 5.47-6.855 9.75-5.75 4.28 1.105 6.855 5.47 5.75 9.75-8.06 31.3-38.23 54-71.75 54C75.367 231.978 44.59 204.454 40.494 168.051 36.398 131.648 60.288 97.972 96 89.81v-19C82.677 66.838 74.286 53.692 76.293 39.935 78.3 26.178 90.097 15.977 104 15.977c13.903 0 25.7 10.201 27.707 23.958C133.714 53.692 125.323 66.838 112 70.81v17.19h56c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-56v24h80c3.028 .002 5.795 1.712 7.15 4.42l28.9 57.8 17.42-5.81c4.192-1.397 8.723 .868 10.12 5.06 1.397 4.192-.868 8.723-5.06 10.12Z"),
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
        return _wheelchair!!
    }

private var _wheelchair: ImageVector? = null
