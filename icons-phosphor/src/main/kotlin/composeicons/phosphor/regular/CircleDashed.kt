package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.CircleDashed: ImageVector
    get() {
        if (_circleDashed != null) return _circleDashed!!
        _circleDashed = phosphorRegularIcon(
            name = "CircleDashed",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M96.26 37.05c-.535-2.056-.23-4.239 .846-6.07 1.077-1.831 2.837-3.158 4.894-3.69 17.054-4.398 34.946-4.398 52 0 3.909 1.001 6.46 4.755 5.952 8.758-.508 4.002-3.917 7-7.952 6.992-.675-.004-1.347-.091-2-.26-14.431-3.722-29.569-3.722-44 0-4.271 1.102-8.628-1.461-9.74-5.73ZM53.79 55.14c-12.334 12.559-21.279 28.042-26 45-1.179 4.258 1.317 8.666 5.575 9.845 4.258 1.179 8.666-1.317 9.845-5.575 3.991-14.354 11.561-27.46 22-38.09 2.836-3.19 2.668-8.046-.382-11.032C61.777 52.302 56.919 52.237 53.79 55.14ZM43.21 151.55c-1.182-4.258-5.592-6.752-9.85-5.57-4.258 1.182-6.752 5.592-5.57 9.85 4.724 16.957 13.669 32.439 26 45 3.098 3.151 8.164 3.193 11.315 .095 3.151-3.098 3.193-8.164 .095-11.315C54.773 178.984 47.208 165.89 43.21 151.55ZM150 213.22c-14.43 3.726-29.57 3.726-44 0-2.784-.765-5.764 .03-7.798 2.08-2.033 2.05-2.805 5.036-2.018 7.814 .787 2.778 3.009 4.917 5.816 5.596 17.054 4.398 34.946 4.398 52 0 4.215-1.157 6.72-5.483 5.627-9.715-1.093-4.232-5.379-6.803-9.627-5.775ZM222.65 146c-2.046-.568-4.234-.298-6.082 .748-1.848 1.047-3.203 2.785-3.768 4.832-3.989 14.352-11.559 27.456-22 38.08-3.096 3.154-3.049 8.219 .105 11.315 3.154 3.096 8.219 3.049 11.315-.105 12.335-12.558 21.281-28.041 26-45 .574-2.048 .309-4.239-.736-6.091-1.045-1.852-2.785-3.212-4.834-3.779ZM212.79 104.46c1.182 4.258 5.592 6.752 9.85 5.57 4.258-1.182 6.752-5.592 5.57-9.85-4.719-16.959-13.665-32.442-26-45-3.098-3.151-8.164-3.193-11.315-.095-3.151 3.098-3.193 8.164-.095 11.315 10.43 10.619 17.996 23.711 21.99 38.05Z"),
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
        return _circleDashed!!
    }

private var _circleDashed: ImageVector? = null
