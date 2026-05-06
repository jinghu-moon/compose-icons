package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.MagnifyingGlass: ImageVector
    get() {
        if (_magnifyingGlass != null) return _magnifyingGlass!!
        _magnifyingGlass = phosphorDuotoneIcon(
            name = "MagnifyingGlass",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M192 112c0 44.183-35.817 80-80 80C67.817 192 32 156.183 32 112 32 67.817 67.817 32 112 32c44.183 0 80 35.817 80 80Z"),
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
                pathData = parseSvgPathData("M229.66 218.34 179.6 168.28C209.801 132.059 206.17 78.49 171.357 46.676 136.545 14.862 82.866 16.057 49.504 49.389 16.143 82.722 14.9 136.399 46.683 171.24c31.783 34.841 85.349 38.519 121.597 8.35l50.06 50.07c3.126 3.126 8.194 3.126 11.32 0 3.126-3.126 3.126-8.194 0-11.32ZM40 112C40 72.235 72.235 40 112 40c39.764 0 72 32.235 72 72 0 39.764-32.236 72-72 72C72.254 183.956 40.044 151.746 40 112Z"),
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
        return _magnifyingGlass!!
    }

private var _magnifyingGlass: ImageVector? = null
