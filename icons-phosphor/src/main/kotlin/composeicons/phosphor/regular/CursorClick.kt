package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.CursorClick: ImageVector
    get() {
        if (_cursorClick != null) return _cursorClick!!
        _cursorClick = phosphorRegularIcon(
            name = "CursorClick",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M88 24v-8c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v8c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8ZM16 104h8c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-8c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8ZM124.42 39.16c1.899 .951 4.098 1.108 6.112 .436 2.015-.672 3.679-2.116 4.628-4.016l8-16c1.977-3.952 .377-8.758-3.575-10.735-3.952-1.977-8.758-.377-10.735 3.575l-8 16c-.952 1.897-1.11 4.095-.44 6.11 .67 2.014 2.112 3.68 4.01 4.63ZM28.42 120.85l-16 8c-3.952 1.977-5.552 6.783-3.575 10.735 1.977 3.952 6.783 5.552 10.735 3.575l16-8c3.952-1.977 5.552-6.783 3.575-10.735-1.977-3.952-6.783-5.552-10.735-3.575ZM219.31 184c3.001 3.001 4.688 7.071 4.688 11.315 0 4.244-1.686 8.314-4.688 11.315l-12.68 12.68c-3.001 3.001-7.071 4.688-11.315 4.688-4.244 0-8.314-1.686-11.315-4.688L132.7 168 115 214.09c0 .1-.08 .21-.13 .32-2.503 5.835-8.25 9.611-14.6 9.59h-.79c-6.635-.281-12.39-4.674-14.41-11L32.8 52.92C30.971 47.212 32.485 40.961 36.723 36.723c4.238-4.238 10.49-5.752 16.197-3.923L213 85.07c6.262 2.095 10.594 7.821 10.906 14.417 .312 6.596-3.46 12.706-9.496 15.383l-.32 .13L168 132.69ZM208 195.31 156.69 144h0c-3.75-3.743-5.404-9.099-4.417-14.305 .987-5.205 4.487-9.585 9.347-11.695l.32-.14 45.95-17.64L48 48l52.2 159.86 17.65-46c0-.11 .08-.22 .13-.33 2.111-4.856 6.488-8.353 11.69-9.34 .99-.183 1.994-.277 3-.28 4.239 .005 8.303 1.691 11.3 4.69L195.31 208Z"),
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
