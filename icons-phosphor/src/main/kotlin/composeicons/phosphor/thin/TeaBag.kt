package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.TeaBag: ImageVector
    get() {
        if (_teaBag != null) return _teaBag!!
        _teaBag = phosphorThinIcon(
            name = "TeaBag",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 164c-11.046 0-20-8.954-20-20v-80C204 35.281 180.719 12 152 12c-28.719 0-52 23.281-52 52v12h-23.47c-4.213 .013-8.114 2.223-10.29 5.83L45.71 116c-1.127 1.878-1.718 4.029-1.71 6.22v93.78c0 6.627 5.373 12 12 12h96c6.627 0 12-5.373 12-12v-93.78c.001-2.177-.59-4.313-1.71-6.18L141.76 81.83C139.584 78.223 135.683 76.013 131.47 76h-23.47v-12c0-24.301 19.699-44 44-44 24.301 0 44 19.699 44 44v80c0 15.464 12.536 28 28 28 2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM131.47 84c1.405-0 2.707 .736 3.43 1.94l20.53 34.22c.373 .622 .57 1.334 .57 2.06v93.78c0 2.209-1.791 4-4 4h-96c-2.209 0-4-1.791-4-4v-93.78c-0-.726 .197-1.438 .57-2.06L73.1 85.94c.723-1.204 2.025-1.94 3.43-1.94h23.47v52c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-52Z"),
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
        return _teaBag!!
    }

private var _teaBag: ImageVector? = null
