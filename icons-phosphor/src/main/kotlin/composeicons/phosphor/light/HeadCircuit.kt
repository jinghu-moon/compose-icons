package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.HeadCircuit: ImageVector
    get() {
        if (_headCircuit != null) return _headCircuit!!
        _headCircuit = phosphorLightIcon(
            name = "HeadCircuit",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M190.37 170.62C210.902 153.826 222.567 128.52 222 102 221 57.32 185.24 20.49 140.66 18.14 117.336 16.871 94.499 25.144 77.399 41.057 60.299 56.97 50.408 79.155 50 102.51L27.31 146.11c-.07 .13-.13 .26-.19 .4-2.896 6.804-.001 14.687 6.61 18l.18 .09 24.08 11v32.4c0 7.732 6.268 14 14 14h48c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6h-47.99c-1.105 0-2-.895-2-2v-36.19c.002-2.348-1.365-4.482-3.5-5.46L39 153.78c-.852-.468-1.244-1.48-.93-2.4L61.28 106.77c.46-.852 .707-1.802 .72-2.77C62.012 68.53 87.174 38.05 122 31.32v19.52c-10.564 2.995-17.302 13.319-15.791 24.195 1.512 10.875 10.811 18.971 21.791 18.971 10.98 0 20.279-8.096 21.791-18.971C151.302 64.159 144.564 53.835 134 50.84v-20.79c2-.05 4-.05 6 .06 30.838 1.763 57.367 22.424 66.63 51.89h-22.63c-1.781 0-3.47 .791-4.61 2.16l-26.45 31.74c-10.055-4.494-21.883-.883-27.715 8.46-5.831 9.343-3.879 21.555 4.575 28.614 8.454 7.059 20.819 6.801 28.971-.604 8.152-7.405 9.594-19.688 3.379-28.78L186.81 94h22.5c.381 2.738 .604 5.496 .67 8.26 .522 23.89-10.487 46.571-29.58 60.94-1.72 1.292-2.616 3.406-2.35 5.54l8 64c.373 3.003 2.924 5.258 5.95 5.26 .251-.002 .501-.018 .75-.05 1.58-.197 3.016-1.014 3.993-2.271 .977-1.257 1.415-2.85 1.217-4.429ZM138 72c0 5.523-4.477 10-10 10-5.523 0-10-4.477-10-10 0-5.523 4.477-10 10-10 5.523 0 10 4.477 10 10ZM144 146c-5.523 0-10-4.477-10-10 0-5.523 4.477-10 10-10 5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10Z"),
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
        return _headCircuit!!
    }

private var _headCircuit: ImageVector? = null
