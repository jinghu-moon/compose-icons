package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Eyedropper: ImageVector
    get() {
        if (_eyedropper != null) return _eyedropper!!
        _eyedropper = phosphorThinIcon(
            name = "Eyedropper",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M220 67.37c-.093-8.65-3.703-16.889-10-22.82C197.54 32.75 177.34 33.22 165 45.6L142.82 67.86l-2-2c-7.81-7.808-20.47-7.808-28.28 0l-9 9c-2.259 2.252-3.529 5.31-3.529 8.5 0 3.19 1.27 6.248 3.529 8.5l4.89 4.89L54.55 150.52C45.229 159.777 41.725 173.394 45.42 186l-8.6 19.7c-1.627 3.664-.833 7.952 2 10.79 3.499 3.509 8.795 4.506 13.33 2.51l18.72-8.18c12.376 3.266 25.555-.304 34.59-9.37l53.86-53.87 4.88 4.89c2.252 2.259 5.31 3.529 8.5 3.529 3.19 0 6.248-1.27 8.5-3.529l9-9c3.756-3.751 5.866-8.842 5.866-14.15 0-5.308-2.11-10.399-5.866-14.15l-2.06-2.06L210.69 90.42c6.107-6.099 9.469-14.421 9.31-23.05ZM99.81 195.78c-7.319 7.334-18.09 10.027-28 7-.915-.285-1.901-.231-2.78 .15l-20 8.75c-1.509 .658-3.267 .325-4.43-.84-.509-.506-.652-1.274-.36-1.93l9.19-21.06c.397-.912 .439-1.938 .12-2.88-3.44-10.09-.824-21.258 6.74-28.77l53.85-53.87 39.6 39.61ZM179.59 110.31c-1.558 1.561-1.558 4.089 0 5.65l4.89 4.89c2.259 2.252 3.529 5.31 3.529 8.5 0 3.19-1.27 6.248-3.529 8.5l-9 9c-.75 .751-1.768 1.173-2.83 1.173-1.062 0-2.08-.422-2.83-1.173L109.18 86.1c-.751-.75-1.173-1.768-1.173-2.83 0-1.062 .422-2.08 1.173-2.83l9-9c2.252-2.259 5.31-3.529 8.5-3.529 3.19 0 6.248 1.27 8.5 3.529L140 76.36c.751 .75 1.769 1.171 2.83 1.17h0c1.063-.002 2.081-.426 2.83-1.18l25-25.1c9.33-9.34 24.52-9.73 33.87-.89 4.715 4.455 7.425 10.629 7.513 17.116 .089 6.486-2.452 12.732-7.043 17.314Z"),
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
        return _eyedropper!!
    }

private var _eyedropper: ImageVector? = null
