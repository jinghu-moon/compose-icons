package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.SlackLogo: ImageVector
    get() {
        if (_slackLogo != null) return _slackLogo!!
        _slackLogo = phosphorThinIcon(
            name = "SlackLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M214.4 128c9.36-5.564 14.645-16.05 13.55-26.884C226.855 90.282 219.578 81.066 209.294 77.487 199.01 73.909 187.584 76.617 180 84.43v-28.43C179.99 43.422 171.594 32.395 159.473 29.038 147.351 25.681 134.479 30.819 128 41.6 122.436 32.24 111.95 26.955 101.116 28.05 90.282 29.145 81.066 36.422 77.487 46.706 73.909 56.99 76.617 68.416 84.43 76h-28.43C43.422 76.01 32.395 84.406 29.038 96.527c-3.357 12.122 1.781 24.994 12.562 31.473-9.36 5.564-14.645 16.05-13.55 26.884 1.095 10.834 8.372 20.05 18.656 23.629 10.284 3.579 21.71 .871 29.294-6.943v28.43c.005 12.58 8.4 23.611 20.523 26.971 12.123 3.359 24.998-1.778 31.477-12.561 5.571 9.349 16.054 14.624 26.882 13.525 10.828-1.099 20.037-8.373 23.616-18.651 3.578-10.278 .877-21.698-6.927-29.284h28.43c12.578-.01 23.605-8.406 26.962-20.527C230.319 147.351 225.181 134.479 214.4 128ZM76 152c0 11.046-8.954 20-20 20C44.954 172 36 163.046 36 152c0-11.046 8.954-20 20-20h20ZM124 200c0 11.046-8.954 20-20 20C92.954 220 84 211.046 84 200v-48c0-11.046 8.954-20 20-20h20ZM124 124h-68C44.954 124 36 115.046 36 104 36 92.954 44.954 84 56 84h48c11.046 0 20 8.954 20 20ZM124 76h-20C92.954 76 84 67.046 84 56 84 44.954 92.954 36 104 36c11.046 0 20 8.954 20 20ZM180 104c0-11.046 8.954-20 20-20 11.046 0 20 8.954 20 20 0 11.046-8.954 20-20 20h-20ZM132 56c0-11.046 8.954-20 20-20 11.046 0 20 8.954 20 20v48c0 11.046-8.954 20-20 20h-20ZM172 200c0 11.046-8.954 20-20 20-11.046 0-20-8.954-20-20v-20h20c11.046 0 20 8.954 20 20ZM200 172h-48c-11.046 0-20-8.954-20-20v-20h68c11.046 0 20 8.954 20 20 0 11.046-8.954 20-20 20Z"),
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
        return _slackLogo!!
    }

private var _slackLogo: ImageVector? = null
