package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BrandDribbble: ImageVector
    get() {
        if (_brandDribbble != null) return _brandDribbble!!
        _brandDribbble = tablerFilledIcon(
            name = "BrandDribbble",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M14.384 14.38c.528 1.578 .882 3.208 1.056 4.863l.064 .644 .126 1.431c-3.028 1.179-6.44 .814-9.15-.98L8.56 18.251l.246-.24c1.793-1.728 3.41-2.875 5.387-3.566l.191-.065ZM20.474 13.597l.414 .003 .981 .014c-.447 2.737-2.012 5.165-4.319 6.704l-.054-.605c-.18-2.057-.55-3.958-1.163-5.814 1.044-.182 2.203-.278 3.529-.298l.611-.004ZM12.605 10.416c.383 .682 .734 1.383 1.052 2.098-2.276 .77-4.142 2.053-6.144 3.967l-.355 .344L4.922 19.065C3.13 17.269 2.087 14.86 2.005 12.324L2 12l.004-.25h1.096l.467-.002c3.547-.026 6.356-.367 8.938-1.295l.1-.037ZM21.993 11.618l-1.515-.02c-1.86-.003-3.45 .124-4.865 .402-.347-.812-.735-1.607-1.163-2.38 1.393-.695 2.757-1.597 4.179-2.75l.428-.354 .816-.682c1.218 1.556 1.949 3.438 2.098 5.409l.022 .375ZM7.33 3.158 8.596 4.68c1.145 1.398 2.121 2.713 2.949 3.985C9.285 9.431 6.806 9.717 3.662 9.746l-.562 .004h-.844C2.91 6.92 4.761 4.513 7.33 3.157ZM17 3.34c.53 .306 1.026 .657 1.483 1.046l-1.025 .857C16.079 6.371 14.77 7.236 13.424 7.892 12.534 6.494 11.481 5.056 10.242 3.534L9.768 2.96 9.283 2.376c2.597-.733 5.38-.385 7.717 .964Z"),
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
        return _brandDribbble!!
    }

private var _brandDribbble: ImageVector? = null
