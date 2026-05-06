package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PushPinSlash: ImageVector
    get() {
        if (_pushPinSlash != null) return _pushPinSlash!!
        _pushPinSlash = phosphorBoldIcon(
            name = "PushPinSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M56.88 31.93C54.012 28.697 49.628 27.256 45.401 28.157c-4.226 .901-7.642 4.005-8.942 8.126-1.3 4.121-.284 8.623 2.661 11.786L60 71C51.054 73.944 42.732 78.525 35.46 84.51c-4.426 3.561-7.129 8.836-7.434 14.508-.305 5.672 1.816 11.207 5.834 15.222l45.46 45.47L39.52 199.51c-4.694 4.694-4.694 12.306 0 17 4.694 4.694 12.306 4.694 17 0L96.32 176.7l45.47 45.46c3.746 3.736 8.819 5.836 14.11 5.84 .47 0 .94 0 1.41-.05 5.775-.417 11.086-3.317 14.56-7.95 3.654-4.845 6.848-10.021 9.54-15.46l17.72 19.49c2.868 3.233 7.252 4.674 11.479 3.773 4.226-.901 7.642-4.005 8.942-8.126 1.3-4.121 .284-8.623-2.661-11.786ZM155.37 201.81 54.08 100.52C62 95 70.31 92.12 78.91 91.83l84.51 93c-1.805 6.036-4.52 11.762-8.05 16.98ZM238.15 106.81l-39 39.11c-4.681 4.694-12.281 4.706-16.975 .025-4.694-4.681-4.706-12.281-.025-16.975L218.34 92.67l-55-55L130.59 70.5c-4.689 4.631-12.235 4.614-16.903-.037-4.668-4.652-4.712-12.198-.097-16.903L149.16 17.87c3.751-3.756 8.842-5.866 14.15-5.866 5.308 0 10.399 2.11 14.15 5.866l60.69 60.68c7.808 7.81 7.808 20.47 0 28.28Z"),
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
        return _pushPinSlash!!
    }

private var _pushPinSlash: ImageVector? = null
