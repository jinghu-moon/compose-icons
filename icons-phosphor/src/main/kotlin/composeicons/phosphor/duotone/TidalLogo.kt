package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.TidalLogo: ImageVector
    get() {
        if (_tidalLogo != null) return _tidalLogo!!
        _tidalLogo = phosphorDuotoneIcon(
            name = "TidalLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M48 56 88 96 48 136 8 96ZM88 96l40 40L168 96 128 56ZM128 216l40-40L128 136 88 176ZM208 56 168 96l40 40L248 96Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M253.66 90.34l-40-40C212.159 48.838 210.123 47.994 208 47.994c-2.123 0-4.159 .844-5.66 2.346L168 84.69 133.66 50.34C132.159 48.838 130.123 47.994 128 47.994c-2.123 0-4.159 .844-5.66 2.346L88 84.69 53.66 50.34C52.159 48.838 50.123 47.994 48 47.994c-2.123 0-4.159 .844-5.66 2.346L2.34 90.34C.838 91.841-.006 93.877-.006 96c0 2.123 .844 4.159 2.346 5.66l40 40c1.501 1.502 3.537 2.346 5.66 2.346 2.123 0 4.159-.844 5.66-2.346L88 107.31 116.69 136 82.34 170.34c-1.502 1.501-2.346 3.537-2.346 5.66 0 2.123 .844 4.159 2.346 5.66l40 40c1.501 1.502 3.537 2.346 5.66 2.346 2.123 0 4.159-.844 5.66-2.346l40-40c1.502-1.501 2.346-3.537 2.346-5.66 0-2.123-.844-4.159-2.346-5.66L139.31 136 168 107.31l34.34 34.35c1.501 1.502 3.537 2.346 5.66 2.346 2.123 0 4.159-.844 5.66-2.346l40-40c1.502-1.501 2.346-3.537 2.346-5.66 0-2.123-.844-4.159-2.346-5.66ZM48 124.69 19.31 96 48 67.31 76.69 96ZM128 204.69 99.31 176 128 147.31 156.69 176ZM128 124.69 99.31 96 128 67.31 156.69 96ZM208 124.69 179.31 96 208 67.31 236.69 96Z"),
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
        return _tidalLogo!!
    }

private var _tidalLogo: ImageVector? = null
