package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Ghost2Line: ImageVector
    get() {
        if (_ghost2Line != null) return _ghost2Line!!
        _ghost2Line = remixIcon(
            name = "Ghost2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 2c3.5 0 6 3 7 6 3 1 4 3.73 4 6l-2.775 .793c-.429 .123-.725 .515-.725 .962v1.496c0 .966-.784 1.75-1.75 1.75h-.596c-.671 0-1.297 .337-1.668 .896C14.558 21.299 13.396 22 12 22 10.604 22 9.442 21.299 8.514 19.896 8.144 19.337 7.517 19 6.846 19h-.596C5.284 19 4.5 18.216 4.5 17.25v-1.496c0-.446-.296-.839-.725-.962L1 14C1 11.734 2 9 5 8 6 5 8.5 2 12 2ZM12 4C9.891 4 7.935 5.788 6.989 8.371l-.091 .261-.316 .949-.949 .316c-1.255 .418-2.068 1.341-2.424 2.559l-.023 .087 1.139 .327c1.229 .351 2.094 1.44 2.17 2.703l.005 .182v1.246h.346c1.263 0 2.447 .596 3.2 1.6l.136 .193C10.758 19.663 11.316 20 12 20c.638 0 1.167-.293 1.703-1.04l.115-.167c.697-1.053 1.848-1.712 3.1-1.786L17.154 17h.346v-1.246c0-1.279 .809-2.409 2.003-2.829l.173-.055 1.139-.327-.023-.088C20.455 11.305 19.712 10.419 18.573 9.972l-.205-.074-.949-.316-.316-.949C16.195 5.909 14.18 4 12 4ZM12 12c.828 0 1.5 1.119 1.5 2.5C13.5 15.881 12.828 17 12 17c-.828 0-1.5-1.119-1.5-2.5C10.5 13.119 11.172 12 12 12ZM9.5 8C10.328 8 11 8.672 11 9.5 11 10.328 10.328 11 9.5 11 8.672 11 8 10.328 8 9.5 8 8.672 8.672 8 9.5 8ZM14.5 8C15.328 8 16 8.672 16 9.5 16 10.328 15.328 11 14.5 11 13.672 11 13 10.328 13 9.5 13 8.672 13.672 8 14.5 8Z"),
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
        return _ghost2Line!!
    }

private var _ghost2Line: ImageVector? = null
