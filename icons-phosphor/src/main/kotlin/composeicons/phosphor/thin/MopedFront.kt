package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.MopedFront: ImageVector
    get() {
        if (_mopedFront != null) return _mopedFront!!
        _mopedFront = phosphorThinIcon(
            name = "MopedFront",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 44h-44.23C161.704 25.807 146.31 12.063 128 12.063 109.69 12.063 94.296 25.807 92.23 44h-44.23c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h44.23c1.263 11.185 7.677 21.138 17.34 26.91C84.817 86.936 68.039 109.978 68 136v64c0 6.627 5.373 12 12 12h20v4c0 15.464 12.536 28 28 28 15.464 0 28-12.536 28-28v-4h20c6.627 0 12-5.373 12-12v-64C187.961 109.978 171.183 86.936 146.43 78.91 156.093 73.138 162.507 63.185 163.77 52h44.23c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM148 216c0 11.046-8.954 20-20 20-11.046 0-20-8.954-20-20v-48c0-11.046 8.954-20 20-20 11.046 0 20 8.954 20 20ZM180 136v64c0 2.209-1.791 4-4 4h-20v-36c0-15.464-12.536-28-28-28-15.464 0-28 12.536-28 28v36h-20c-2.209 0-4-1.791-4-4v-64C76 107.281 99.281 84 128 84c28.719 0 52 23.281 52 52ZM128 76C112.536 76 100 63.464 100 48c0-15.464 12.536-28 28-28 15.464 0 28 12.536 28 28 0 15.464-12.536 28-28 28Z"),
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
        return _mopedFront!!
    }

private var _mopedFront: ImageVector? = null
