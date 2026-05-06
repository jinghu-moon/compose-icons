package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Password: ImageVector
    get() {
        if (_password != null) return _password!!
        _password = phosphorThinIcon(
            name = "Password",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M44 56v144c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-144c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4ZM141.2 114.31 116 122.49v-26.49c0-2.209-1.791-4-4-4-2.209 0-4 1.791-4 4v26.49L82.8 114.31c-2.101-.682-4.358 .469-5.04 2.57-.682 2.101 .469 4.358 2.57 5.04l25.2 8.18L90 151.54c-.888 1.153-1.079 2.698-.499 4.033 .58 1.335 1.839 2.25 3.288 2.388 1.449 .139 2.859-.521 3.681-1.721L112 134.81l15.57 21.43c.753 1.037 1.958 1.651 3.24 1.65 1.503-.003 2.877-.847 3.558-2.186 .681-1.339 .554-2.948-.328-4.164L118.47 130.1l25.2-8.18c2.101-.682 3.252-2.939 2.57-5.04-.682-2.101-2.939-3.252-5.04-2.57ZM242.2 116.88c-.682-2.081-2.911-3.226-5-2.57L212 122.49v-26.49c0-2.209-1.791-4-4-4-2.209 0-4 1.791-4 4v26.49l-25.2-8.18c-2.101-.682-4.358 .469-5.04 2.57-.682 2.101 .469 4.358 2.57 5.04l25.2 8.18L186 151.54c-.888 1.153-1.079 2.698-.499 4.033 .58 1.335 1.839 2.25 3.288 2.388 1.449 .139 2.859-.521 3.681-1.721L208 134.81l15.57 21.43c.753 1.037 1.958 1.651 3.24 1.65 1.503-.003 2.877-.847 3.558-2.186 .681-1.339 .554-2.948-.328-4.164L214.47 130.1l25.2-8.18c1.009-.327 1.847-1.042 2.329-1.988 .482-.945 .569-2.043 .241-3.052Z"),
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
        return _password!!
    }

private var _password: ImageVector? = null
