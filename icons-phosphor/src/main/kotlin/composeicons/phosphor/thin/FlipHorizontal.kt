package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FlipHorizontal: ImageVector
    get() {
        if (_flipHorizontal != null) return _flipHorizontal!!
        _flipHorizontal = phosphorThinIcon(
            name = "FlipHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M106.38 28.26c-5.608-1.238-11.29 1.755-13.44 7.08v.08L29 195.32c-1.566 3.698-1.179 7.934 1.032 11.287 2.211 3.352 5.952 5.377 9.968 5.393h64c6.627 0 12-5.373 12-12v-160c.09-5.737-3.977-10.701-9.62-11.74ZM108 200c0 2.209-1.791 4-4 4h-64c-1.343 .012-2.599-.664-3.33-1.79-.757-1.141-.878-2.59-.32-3.84l64-159.94c.766-1.711 2.618-2.66 4.455-2.283 1.836 .377 3.165 1.979 3.195 3.853ZM227.07 195.4l-64-160v-.08c-2.21-5.282-7.844-8.267-13.456-7.129C144.003 29.33 139.977 34.274 140 40v160c0 6.627 5.373 12 12 12h64c4.009-.001 7.752-2.004 9.978-5.338 2.225-3.334 2.639-7.559 1.102-11.262ZM219.32 202.21c-.729 1.123-1.981 1.798-3.32 1.79h-64c-2.209 0-4-1.791-4-4v-160c-.08-1.929 1.294-3.613 3.2-3.92 .296-.059 .598-.089 .9-.09 1.587-.045 3.024 .929 3.57 2.42l64 160c.553 1.241 .421 2.681-.35 3.8Z"),
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
        return _flipHorizontal!!
    }

private var _flipHorizontal: ImageVector? = null
