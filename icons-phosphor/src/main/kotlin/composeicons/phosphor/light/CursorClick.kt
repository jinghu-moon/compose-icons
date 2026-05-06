package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CursorClick: ImageVector
    get() {
        if (_cursorClick != null) return _cursorClick!!
        _cursorClick = phosphorLightIcon(
            name = "CursorClick",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M90 24v-8c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6v8c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6ZM16 102h8c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6h-8c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6ZM125.32 37.37c1.424 .711 3.073 .827 4.582 .323 1.51-.505 2.757-1.588 3.468-3.013l8-16c1.483-2.966 .281-6.572-2.685-8.055-2.966-1.483-6.572-.281-8.055 2.685l-8 16c-.714 1.425-.832 3.076-.328 4.588 .505 1.512 1.59 2.761 3.018 3.472ZM29.32 122.63l-16 8c-2.966 1.48-4.17 5.084-2.69 8.05 1.48 2.966 5.084 4.17 8.05 2.69l16-8c2.966-1.48 4.17-5.084 2.69-8.05-1.48-2.966-5.084-4.17-8.05-2.69ZM217.9 185.41c2.626 2.626 4.101 6.187 4.101 9.9 0 3.713-1.475 7.274-4.101 9.9l-12.69 12.69c-2.626 2.626-6.187 4.101-9.9 4.101-3.713 0-7.274-1.475-9.9-4.101L134.1 166.59c-.457-.456-1.107-.663-1.744-.556-.637 .107-1.183 .515-1.466 1.096l-17.75 46.24c-.038 .078-.071 .158-.1 .24-2.191 5.107-7.223 8.411-12.78 8.39-.23 0-.45 0-.68 0C93.786 221.743 88.766 217.904 87 212.38L34.7 52.3C33.103 47.308 34.428 41.841 38.135 38.135c3.706-3.706 9.173-5.032 14.165-3.435L212.38 87c5.43 1.861 9.174 6.848 9.445 12.582 .271 5.734-2.985 11.052-8.215 13.418l-.24 .09-46.25 17.76c-.579 .285-.985 .832-1.09 1.469-.105 .637 .104 1.285 .56 1.741ZM209.41 193.9 158.1 142.59h0c-3.276-3.276-4.719-7.961-3.855-12.513 .865-4.552 3.925-8.381 8.175-10.227l.24-.1L208.91 102c.676-.379 1.071-1.115 1.016-1.888-.056-.773-.553-1.444-1.276-1.722L48.58 46.11c-.21-.067-.429-.104-.65-.11-.616 .029-1.185 .341-1.541 .845-.356 .504-.459 1.145-.279 1.735L98.38 208.65c.22 .796 .944 1.348 1.77 1.35 .785 .077 1.53-.364 1.84-1.09l17.76-46.25 .1-.24c1.846-4.249 5.676-7.31 10.227-8.175 4.552-.865 9.237 .579 12.513 3.855l51.31 51.31c.375 .376 .884 .587 1.415 .587 .531 0 1.04-.211 1.415-.587l12.68-12.68c.376-.375 .587-.884 .587-1.415 0-.531-.211-1.04-.587-1.415Z"),
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
        return _cursorClick!!
    }

private var _cursorClick: ImageVector? = null
