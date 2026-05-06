package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.HandSoap: ImageVector
    get() {
        if (_handSoap != null) return _handSoap!!
        _handSoap = phosphorThinIcon(
            name = "HandSoap",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M180 100.23v-12.23C180 72.536 167.464 60 152 60h-20v-32h36c6.627 0 12 5.373 12 12 0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4C188 28.954 179.046 20 168 20h-64c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h20v32h-20C88.536 60 76 72.536 76 88v12.23C57.782 102.267 44.004 117.668 44 136v80c0 6.627 5.373 12 12 12h144c6.627 0 12-5.373 12-12v-80c-.004-18.332-13.782-33.733-32-35.77ZM104 68h48c11.046 0 20 8.954 20 20v12h-88v-12C84 76.954 92.954 68 104 68ZM204 216c0 2.209-1.791 4-4 4h-144c-2.209 0-4-1.791-4-4v-80c0-15.464 12.536-28 28-28h96c15.464 0 28 12.536 28 28Z"),
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
        return _handSoap!!
    }

private var _handSoap: ImageVector? = null
