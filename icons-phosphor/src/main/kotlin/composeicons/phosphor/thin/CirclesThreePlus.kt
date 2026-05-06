package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CirclesThreePlus: ImageVector
    get() {
        if (_circlesThreePlus != null) return _circlesThreePlus!!
        _circlesThreePlus = phosphorThinIcon(
            name = "CirclesThreePlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M80 44C60.118 44 44 60.118 44 80c0 19.882 16.118 36 36 36 19.882 0 36-16.118 36-36C116 60.118 99.882 44 80 44ZM80 108C64.536 108 52 95.464 52 80 52 64.536 64.536 52 80 52c15.464 0 28 12.536 28 28 0 15.464-12.536 28-28 28ZM176 116c19.882 0 36-16.118 36-36C212 60.118 195.882 44 176 44c-19.882 0-36 16.118-36 36 0 19.882 16.118 36 36 36ZM176 52c15.464 0 28 12.536 28 28 0 15.464-12.536 28-28 28C160.536 108 148 95.464 148 80c0-15.464 12.536-28 28-28ZM80 140c-19.882 0-36 16.118-36 36 0 19.882 16.118 36 36 36 19.882 0 36-16.118 36-36C116 156.118 99.882 140 80 140ZM80 204C64.536 204 52 191.464 52 176c0-15.464 12.536-28 28-28 15.464 0 28 12.536 28 28 0 15.464-12.536 28-28 28ZM212 176c0 2.209-1.791 4-4 4h-28v28c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-28h-28c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h28v-28c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4v28h28c2.209 0 4 1.791 4 4Z"),
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
        return _circlesThreePlus!!
    }

private var _circlesThreePlus: ImageVector? = null
