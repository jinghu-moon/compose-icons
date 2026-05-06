package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ForkKnife: ImageVector
    get() {
        if (_forkKnife != null) return _forkKnife!!
        _forkKnife = phosphorRegularIcon(
            name = "ForkKnife",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M72 88v-48c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v48c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8ZM216 40v184c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-48h-48c-4.418 0-8-3.582-8-8 .371-19.163 2.792-38.232 7.22-56.88C161 70.63 179.54 43.49 204.85 32.65c2.471-1.058 5.309-.805 7.553 .674 2.244 1.48 3.596 3.987 3.597 6.676ZM200 53.9C167.83 78.47 161.53 138.32 160.3 160h39.7ZM119.89 38.69c-.426-2.859-2.362-5.266-5.063-6.295-2.701-1.03-5.748-.522-7.969 1.328-2.221 1.85-3.272 4.754-2.748 7.597L112 88.63c0 17.673-14.327 32-32 32-17.673 0-32-14.327-32-32L55.88 41.32c.524-2.843-.527-5.747-2.748-7.597C50.911 31.873 47.864 31.365 45.163 32.395c-2.701 1.03-4.637 3.436-5.063 6.295l-8 48c-.068 .433-.102 .871-.1 1.31 .033 23.409 16.923 43.39 40 47.32v88.68c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-88.68C111.077 131.39 127.967 111.409 128 88c-.001-.439-.038-.877-.11-1.31Z"),
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
        return _forkKnife!!
    }

private var _forkKnife: ImageVector? = null
