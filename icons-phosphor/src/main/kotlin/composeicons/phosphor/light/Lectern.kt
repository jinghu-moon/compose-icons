package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Lectern: ImageVector
    get() {
        if (_lectern != null) return _lectern!!
        _lectern = phosphorLightIcon(
            name = "Lectern",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M244.51 121.74l-40-80C202.155 36.987 197.304 33.986 192 34h-128c-5.308-.018-10.164 2.984-12.52 7.74l-40 80c-2.169 4.339-1.937 9.493 .613 13.62 2.55 4.127 7.056 6.639 11.907 6.64h98v68h-26c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h64c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6h-26v-68h98c4.851-.001 9.357-2.513 11.907-6.64 2.55-4.127 2.782-9.28 .613-13.62ZM233.69 129.05c-.354 .6-1.003 .963-1.7 .95h-207.99c-.692-0-1.335-.359-1.699-.947-.364-.588-.399-1.323-.091-1.943l40-80C62.548 46.43 63.241 46 64 46h128c.759 0 1.452 .43 1.79 1.11l40 80c.304 .621 .266 1.354-.1 1.94ZM190 104c0 3.314-2.686 6-6 6h-112c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h112c3.314 0 6 2.686 6 6Z"),
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
        return _lectern!!
    }

private var _lectern: ImageVector? = null
