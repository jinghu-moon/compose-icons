package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.DropboxLogo: ImageVector
    get() {
        if (_dropboxLogo != null) return _dropboxLogo!!
        _dropboxLogo = phosphorDuotoneIcon(
            name = "DropboxLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 84 76 120 24 84 76 48ZM232 84 180 48 128 84l52 36ZM24 156l52 36 52-36L76 120ZM128 156l52 36 52-36L180 120Z"),
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
                pathData = parseSvgPathData("M236.55 149.42 194.05 120 236.55 90.58c2.16-1.494 3.45-3.953 3.45-6.58 0-2.627-1.289-5.086-3.45-6.58l-52-36c-2.738-1.893-6.362-1.893-9.1 0L128 74.27 80.55 41.42c-2.738-1.893-6.362-1.893-9.1 0l-52 36C17.29 78.914 16 81.373 16 84c0 2.627 1.289 5.086 3.45 6.58L62 120 19.5 149.42c-2.16 1.494-3.45 3.953-3.45 6.58 0 2.627 1.289 5.086 3.45 6.58l52 36c2.738 1.893 6.362 1.893 9.1 0L128 165.73l47.45 32.85c2.738 1.893 6.362 1.893 9.1 0l52-36c2.16-1.494 3.45-3.953 3.45-6.58 0-2.627-1.289-5.086-3.45-6.58ZM180 57.73 218 84l-38 26.27L142.05 84ZM38.05 84 76 57.73 114 84 76 110.27ZM76.05 182.27 38.05 156 76.05 129.73 114 156ZM90.05 120l38-26.27L166 120l-38 26.27ZM180.05 182.27 142.05 156 180 129.73 218 156ZM158.52 206.91c2.519 3.626 1.624 8.608-2 11.13l-23.89 16.54c-2.738 1.893-6.362 1.893-9.1 0L99.56 218c-3.613-2.521-4.508-7.488-2.003-11.111 2.506-3.623 7.469-4.539 11.103-2.049L128 218.27l19.34-13.39c3.634-2.513 8.617-1.604 11.13 2.03Z"),
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
