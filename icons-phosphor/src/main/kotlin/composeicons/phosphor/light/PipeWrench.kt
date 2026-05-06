package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.PipeWrench: ImageVector
    get() {
        if (_pipeWrench != null) return _pipeWrench!!
        _pipeWrench = phosphorLightIcon(
            name = "PipeWrench",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M218.87 56.44c-.046-.041-.089-.084-.13-.13L173.83 14c-5.473-5.392-14.269-5.365-19.71 .06L108.12 59.68l-3-3C96.001 48.681 82.237 49.14 73.67 57.728c-8.567 8.588-8.991 22.353-.97 31.452l2.85 2.89L54.1 113.41c-2.626 2.626-4.101 6.187-4.101 9.9 0 3.713 1.475 7.274 4.101 9.9l12.69 12.69c5.463 5.441 14.297 5.441 19.76 0l21.35-21.05 13.51 13.7c.376 .375 .587 .884 .587 1.415 0 .531-.211 1.04-.587 1.415h0L56.73 206.79c-6.302 5.698-8.95 14.406-6.886 22.647 2.064 8.241 8.502 14.674 16.746 16.73 8.243 2.056 16.949-.6 22.641-6.907l88.67-89.36c5.455-5.465 5.455-14.315 0-19.78L140.79 92.64 155.14 78.58c.78-.775 2.04-.775 2.82 0l.07 .07L195.42 114c5.48 5.409 14.299 5.378 19.74-.07l3.71-3.72c14.84-14.84 14.84-38.9 0-53.74ZM78.1 137.44c-.375 .376-.884 .587-1.415 .587-.531 0-1.04-.211-1.415-.587L62.58 124.73c-.374-.377-.583-.888-.58-1.42-0-.523 .204-1.026 .57-1.4L84 100.62l15.5 15.72ZM169.4 141.44 80.73 230.79c-2.699 3.115-6.913 4.459-10.918 3.483-4.004-.976-7.127-4.109-8.09-8.116-.963-4.007 .395-8.217 3.518-10.906l64.67-65.37c5.435-5.462 5.435-14.288 0-19.75L81.21 80.73C77.404 76.376 77.62 69.817 81.704 65.722c4.084-4.095 10.642-4.328 15.006-.532l72.7 73.39c.38 .377 .594 .891 .592 1.427-.002 .536-.219 1.048-.602 1.423ZM210.4 101.71l-3.71 3.71c-.375 .376-.884 .587-1.415 .587-.531 0-1.04-.211-1.415-.587l-.12-.12L166.31 70c-5.472-5.315-14.192-5.27-19.61 .1L132.35 84.12 116.6 68.22 162.6 22.58c.376-.379 .887-.592 1.42-.592 .533 0 1.044 .213 1.42 .592l.12 .13L210.45 65c10.095 10.166 10.063 26.583-.07 36.71Z"),
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
        return _pipeWrench!!
    }

private var _pipeWrench: ImageVector? = null
