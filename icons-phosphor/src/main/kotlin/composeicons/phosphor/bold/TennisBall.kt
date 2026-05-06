package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.TennisBall: ImageVector
    get() {
        if (_tennisBall != null) return _tennisBall!!
        _tennisBall = phosphorBoldIcon(
            name = "TennisBall",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M204.4 51.6C162.214 9.45 93.849 9.469 51.687 51.643 9.524 93.817 9.524 162.183 51.687 204.357c42.162 42.174 110.527 42.194 152.713 .043 42.132-42.221 42.132-110.579 0-152.8ZM68.58 68.6C81.093 56.055 97.274 47.818 114.78 45.08c-5.748 35.856-33.864 63.972-69.72 69.72C47.794 97.287 56.031 81.099 68.58 68.58ZM44.74 139.07c24.027-2.843 46.388-13.726 63.45-30.88C125.344 91.128 136.227 68.767 139.07 44.74c37.629 4.95 67.24 34.561 72.19 72.19-49.404 5.982-88.343 44.916-94.33 94.32C79.301 206.308 49.687 176.699 44.74 139.07ZM187.42 187.42c-12.516 12.541-28.695 20.778-46.2 23.52 5.748-35.856 33.864-63.972 69.72-69.72-2.738 17.506-10.975 33.687-23.52 46.2Z"),
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
        return _tennisBall!!
    }

private var _tennisBall: ImageVector? = null
