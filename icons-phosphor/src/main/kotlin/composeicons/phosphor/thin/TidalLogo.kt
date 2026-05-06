package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.TidalLogo: ImageVector
    get() {
        if (_tidalLogo != null) return _tidalLogo!!
        _tidalLogo = phosphorThinIcon(
            name = "TidalLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M250.83 93.17l-40-40c-.75-.751-1.768-1.173-2.83-1.173-1.062 0-2.08 .422-2.83 1.173L168 90.34 130.83 53.17c-.75-.751-1.768-1.173-2.83-1.173-1.062 0-2.08 .422-2.83 1.173L88 90.34 50.83 53.17C50.08 52.419 49.062 51.997 48 51.997c-1.062 0-2.08 .422-2.83 1.173l-40 40C4.419 93.92 3.997 94.938 3.997 96c0 1.062 .422 2.08 1.173 2.83l40 40c.75 .751 1.768 1.173 2.83 1.173 1.062 0 2.08-.422 2.83-1.173L88 101.66 122.34 136 85.17 173.17c-.751 .75-1.173 1.768-1.173 2.83 0 1.062 .422 2.08 1.173 2.83l40 40c.75 .751 1.768 1.173 2.83 1.173 1.062 0 2.08-.422 2.83-1.173l40-40c.751-.75 1.173-1.768 1.173-2.83 0-1.062-.422-2.08-1.173-2.83L133.66 136 168 101.66l37.17 37.17c.75 .751 1.768 1.173 2.83 1.173 1.062 0 2.08-.422 2.83-1.173l40-40c.751-.75 1.173-1.768 1.173-2.83 0-1.062-.422-2.08-1.173-2.83ZM48 130.34 13.66 96 48 61.66 82.34 96ZM128 210.34 93.66 176 128 141.66 162.34 176ZM128 130.34 93.66 96 128 61.66 162.34 96ZM208 130.34 173.66 96 208 61.66 242.34 96Z"),
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
