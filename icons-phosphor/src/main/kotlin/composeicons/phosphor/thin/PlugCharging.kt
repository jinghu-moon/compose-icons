package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.PlugCharging: ImageVector
    get() {
        if (_plugCharging != null) return _plugCharging!!
        _plugCharging = phosphorThinIcon(
            name = "PlugCharging",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 60h-52v-44c0-2.209-1.791-4-4-4-2.209 0-4 1.791-4 4v44h-72v-44c0-2.209-1.791-4-4-4-2.209 0-4 1.791-4 4v44h-51.45C28.13 60 28 63.59 28 64c0 2.209 1.791 4 4 4h20v92c0 19.882 16.118 36 36 36h36v44c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-44h36c19.882 0 36-16.118 36-36v-92h20c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM196 160c0 15.464-12.536 28-28 28h-80C72.536 188 60 175.464 60 160v-92h136ZM108.71 130.28c-.747-1.077-.919-2.452-.46-3.68l12-32c.773-2.071 3.079-3.123 5.15-2.35 2.071 .773 3.123 3.079 2.35 5.15l-10 26.6h26.25c1.312-.001 2.54 .641 3.288 1.718 .748 1.077 .921 2.453 .462 3.682l-12 32c-.773 2.071-3.079 3.123-5.15 2.35-2.071-.773-3.123-3.079-2.35-5.15l10-26.6h-26.25c-1.312 .001-2.542-.642-3.29-1.72Z"),
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
        return _plugCharging!!
    }

private var _plugCharging: ImageVector? = null
