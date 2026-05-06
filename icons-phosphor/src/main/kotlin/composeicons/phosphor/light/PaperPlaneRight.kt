package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.PaperPlaneRight: ImageVector
    get() {
        if (_paperPlaneRight != null) return _paperPlaneRight!!
        _paperPlaneRight = phosphorLightIcon(
            name = "PaperPlaneRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M230.88 115.69 62.88 19.81C57.799 16.994 51.508 17.609 47.068 21.354c-4.44 3.745-6.106 9.843-4.188 15.326L73.66 128 42.81 219.33c-1.516 4.284-.858 9.037 1.764 12.748 2.622 3.711 6.882 5.919 11.426 5.922 2.429-.005 4.815-.635 6.93-1.83L230.84 140.1c4.411-2.479 7.142-7.145 7.142-12.205 0-5.06-2.73-9.726-7.142-12.205ZM224.93 129.69 57 225.73c-.728 .408-1.632 .321-2.269-.218-.637-.539-.872-1.417-.591-2.202 .004-.033 .004-.067 0-.1L84.3 134h59.7c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6h-59.7L54.17 32.8c.006-.033 .006-.067 0-.1-.322-.785-.076-1.688 .6-2.2 .602-.576 1.515-.678 2.23-.25l168 95.89c.632 .347 1.018 1.019 1 1.74 .003 .747-.409 1.433-1.07 1.78Z"),
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
        return _paperPlaneRight!!
    }

private var _paperPlaneRight: ImageVector? = null
