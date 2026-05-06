package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Sailboat: ImageVector
    get() {
        if (_sailboat != null) return _sailboat!!
        _sailboat = phosphorThinIcon(
            name = "Sailboat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M243.61 174.27c-.666-1.389-2.07-2.271-3.61-2.27h-100v-32h76c1.59 .016 3.039-.912 3.69-2.363 .651-1.451 .38-3.15-.69-4.327L140 46.45v-38.45c-.003-1.69-1.069-3.196-2.662-3.762-1.593-.565-3.37-.068-4.438 1.242L28.9 133.48c-.971 1.197-1.168 2.846-.506 4.238 .662 1.392 2.065 2.28 3.606 2.282h100v32h-116c-1.537 .001-2.938 .883-3.604 2.269-.665 1.386-.477 3.031 .484 4.231l29.59 37c2.278 2.845 5.725 4.501 9.37 4.5h152.32c3.645 .001 7.092-1.655 9.37-4.5l29.59-37c.963-1.199 1.153-2.843 .49-4.23ZM207 132h-67v-73.65ZM40.4 132 132 19.27v112.73ZM207.28 210.5c-.759 .947-1.906 1.499-3.12 1.5h-152.32c-1.214-.001-2.361-.553-3.12-1.5L24.32 180h207.36Z"),
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
        return _sailboat!!
    }

private var _sailboat: ImageVector? = null
