package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.PenNibStraight: ImageVector
    get() {
        if (_penNibStraight != null) return _penNibStraight!!
        _penNibStraight = phosphorThinIcon(
            name = "PenNibStraight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M218.75 125.66c-.027-.066-.061-.13-.1-.19L188 70.94v-38.94c0-6.627-5.373-12-12-12h-96C73.373 20 68 25.373 68 32v39L37.34 125.47l-.1 .19c-2 4.051-1.556 8.882 1.15 12.5l86.44 112.28c.757 .984 1.928 1.561 3.17 1.561 1.242 0 2.413-.577 3.17-1.561L217.66 138.09c2.658-3.614 3.079-8.409 1.09-12.43ZM80 28h96c2.209 0 4 1.791 4 4v36h-104v-36c0-2.209 1.791-4 4-4ZM128 148c-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16ZM211.27 133.28 132 236.25v-80.59c12.302-2.079 20.959-13.238 19.916-25.671C150.873 117.556 140.477 107.996 128 107.996c-12.477 0-22.873 9.56-23.916 21.993-1.043 12.433 7.614 23.592 19.916 25.671v80.58L44.78 133.34c-.865-1.179-1.019-2.735-.4-4.06L74.35 76h107.31l30 53.28c.598 1.307 .449 2.833-.39 4Z"),
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
        return _penNibStraight!!
    }

private var _penNibStraight: ImageVector? = null
