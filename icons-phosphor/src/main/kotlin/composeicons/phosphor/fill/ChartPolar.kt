package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ChartPolar: ImageVector
    get() {
        if (_chartPolar != null) return _chartPolar!!
        _chartPolar = phosphorFillIcon(
            name = "ChartPolar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M120 199.54v27.74c.008 1.146-.476 2.239-1.329 3.004-.853 .765-1.993 1.127-3.131 .996C68.007 225.468 30.552 188.013 24.74 140.48c-.132-1.138 .231-2.278 .996-3.131 .765-.853 1.859-1.337 3.004-1.329h27.72c3.79 33.393 30.146 59.74 63.54 63.52ZM183.42 136h-47.42v47.42c24.553-3.583 43.837-22.867 47.42-47.42ZM136 72.58v47.42h47.42C179.837 95.447 160.553 76.163 136 72.58ZM227.28 136h-27.74c-3.782 33.401-30.139 59.758-63.54 63.54v27.74c-.008 1.146 .476 2.239 1.329 3.004 .853 .765 1.993 1.127 3.131 .996 47.533-5.812 84.988-43.267 90.8-90.8 .138-1.138-.22-2.28-.981-3.137-.761-.857-1.853-1.346-2.999-1.343ZM199.54 120h27.74c1.146 .008 2.239-.476 3.004-1.329 .765-.853 1.127-1.993 .996-3.131C225.468 68.007 188.013 30.552 140.48 24.74c-1.138-.132-2.278 .231-3.131 .996-.853 .765-1.337 1.859-1.329 3.004v27.72c33.393 3.79 59.74 30.146 63.52 63.54ZM115.54 24.74C68.007 30.552 30.552 68.007 24.74 115.54c-.132 1.138 .231 2.278 .996 3.131 .765 .853 1.859 1.337 3.004 1.329h27.72C60.242 86.599 86.599 60.242 120 56.46v-27.74c.002-1.142-.485-2.231-1.337-2.991-.852-.76-1.989-1.12-3.123-.989ZM72.58 120h47.42v-47.42C95.447 76.163 76.163 95.447 72.58 120ZM120 183.42v-47.42h-47.42c3.583 24.553 22.867 43.837 47.42 47.42Z"),
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
        return _chartPolar!!
    }

private var _chartPolar: ImageVector? = null
