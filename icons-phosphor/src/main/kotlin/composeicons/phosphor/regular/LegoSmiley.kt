package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.LegoSmiley: ImageVector
    get() {
        if (_legoSmiley != null) return _legoSmiley!!
        _legoSmiley = phosphorRegularIcon(
            name = "LegoSmiley",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M100 124c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12ZM156 100c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM151.73 145.23c-14.534 9.02-32.926 9.02-47.46 0-3.739-2.358-8.682-1.239-11.04 2.5-2.358 3.739-1.239 8.682 2.5 11.04 19.752 12.313 44.788 12.313 64.54 0 3.739-2.358 4.858-7.301 2.5-11.04-2.358-3.739-7.301-4.858-11.04-2.5ZM216 80v96c-.014 14.591-9.878 27.332-24 31v17c0 8.837-7.163 16-16 16h-96c-8.837 0-16-7.163-16-16v-17C49.878 203.332 40.014 190.591 40 176v-96C40 62.327 54.327 48 72 48h16v-16c0-8.837 7.163-16 16-16h48c8.837 0 16 7.163 16 16v16h16c17.673 0 32 14.327 32 32ZM104 48h48v-16h-48ZM176 224v-16h-96v16ZM200 80c0-8.837-7.163-16-16-16h-112C63.163 64 56 71.163 56 80v96c0 8.837 7.163 16 16 16h112c8.837 0 16-7.163 16-16Z"),
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
        return _legoSmiley!!
    }

private var _legoSmiley: ImageVector? = null
