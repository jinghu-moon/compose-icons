package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.TailwindCssFill: ImageVector
    get() {
        if (_tailwindCssFill != null) return _tailwindCssFill!!
        _tailwindCssFill = remixIcon(
            name = "TailwindCssFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 4.86C8.826 4.86 6.843 6.447 6.05 9.62 7.24 8.033 8.628 7.438 10.215 7.835c.905 .226 1.552 .883 2.269 1.61C13.651 10.63 15 12 17.95 12c3.173 0 5.157-1.587 5.95-4.76C22.71 8.827 21.321 9.422 19.735 9.025 18.829 8.799 18.183 8.142 17.466 7.415 16.299 6.23 14.95 4.86 12 4.86ZM6.05 12C2.876 12 .893 13.587 .1 16.76 1.29 15.173 2.678 14.578 4.265 14.975c.905 .226 1.552 .883 2.269 1.611 1.167 1.184 2.517 2.554 5.466 2.554 3.173 0 5.157-1.587 5.95-4.76-1.19 1.587-2.578 2.182-4.165 1.785-.905-.226-1.552-.883-2.269-1.611C10.349 13.37 9 12 6.05 12Z"),
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
        return _tailwindCssFill!!
    }

private var _tailwindCssFill: ImageVector? = null
