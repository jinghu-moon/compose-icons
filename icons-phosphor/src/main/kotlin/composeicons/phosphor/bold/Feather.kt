package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Feather: ImageVector
    get() {
        if (_feather != null) return _feather!!
        _feather = phosphorBoldIcon(
            name = "Feather",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224.11 31.92C197.575 5.388 154.563 5.366 128 31.87L57.88 101.17c-3.767 3.741-5.884 8.831-5.88 14.14v71.69L23.52 215.51c-4.694 4.694-4.694 12.306 0 17 4.694 4.694 12.306 4.694 17 0L69 204h71.7c5.31 .016 10.406-2.094 14.15-5.86h.05l69.21-70c26.558-26.575 26.558-69.645 0-96.22ZM144.9 48.92c16.581-16.701 43.368-17.399 60.795-1.583C223.122 63.153 225.019 89.882 210 108h-45L192.52 80.49c4.694-4.694 4.694-12.306 0-17-4.694-4.694-12.306-4.694-17 0L124 115v-45.46ZM76 117 100 93.28v45.72L76 163ZM139 180h-46l48-48h45.5Z"),
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
        return _feather!!
    }

private var _feather: ImageVector? = null
