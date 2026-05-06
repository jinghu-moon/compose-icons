package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.DropboxLogo: ImageVector
    get() {
        if (_dropboxLogo != null) return _dropboxLogo!!
        _dropboxLogo = phosphorThinIcon(
            name = "DropboxLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M234.28 152.71 187 120 234.25 87.29c1.08-.747 1.725-1.977 1.725-3.29 0-1.313-.645-2.543-1.725-3.29l-52-36c-1.371-.951-3.189-.951-4.56 0L128 79.14 78.28 44.71c-1.371-.951-3.189-.951-4.56 0l-52 36c-1.08 .747-1.725 1.977-1.725 3.29 0 1.313 .645 2.543 1.725 3.29L69 120 21.72 152.71c-1.08 .747-1.725 1.977-1.725 3.29 0 1.313 .645 2.543 1.725 3.29l52 36c1.371 .951 3.189 .951 4.56 0L128 160.86l49.72 34.43c1.371 .951 3.189 .951 4.56 0l52-36c1.08-.747 1.725-1.977 1.725-3.29 0-1.313-.645-2.543-1.725-3.29ZM128 151.14 83 120 128 88.86 173 120ZM180 52.87 225 84l-45 31.13L135 84ZM76 52.87 121 84 76 115.13 31 84ZM76 187.13 31 156 76 124.87 121 156ZM180 187.13 135 156l45-31.13L225 156ZM155.18 209.18c.606 .871 .842 1.948 .654 2.992-.188 1.045-.783 1.972-1.654 2.578l-23.89 16.54c-1.371 .951-3.189 .951-4.56 0L101.84 214.75c-1.817-1.259-2.269-3.753-1.01-5.57 1.259-1.817 3.753-2.269 5.57-1.01l21.61 15 21.61-15c1.815-1.254 4.302-.802 5.56 1.01Z"),
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
        return _dropboxLogo!!
    }

private var _dropboxLogo: ImageVector? = null
