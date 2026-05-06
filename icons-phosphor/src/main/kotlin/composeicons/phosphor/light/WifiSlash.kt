package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.WifiSlash: ImageVector
    get() {
        if (_wifiSlash != null) return _wifiSlash!!
        _wifiSlash = phosphorLightIcon(
            name = "WifiSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M138 204c0 5.523-4.477 10-10 10-5.523 0-10-4.477-10-10 0-5.523 4.477-10 10-10 5.523 0 10 4.477 10 10ZM52.44 36c-2.277-2.113-5.79-2.139-8.098-.06-2.308 2.079-2.647 5.576-.782 8.06L61.33 63.58c-14.833 6.332-28.687 14.751-41.14 25-1.667 1.358-2.479 3.504-2.131 5.625 .349 2.121 1.806 3.894 3.82 4.647 2.014 .753 4.276 .371 5.931-1.002C40.465 87.427 54.669 79.043 69.91 73l26.48 29.13c-16.064 4.317-31.077 11.868-44.12 22.19-2.598 2.06-3.035 5.836-.975 8.435 2.06 2.598 5.836 3.035 8.435 .975 13.412-10.627 29.118-17.979 45.87-21.47l31.13 34.25c-2.897-.341-5.813-.511-8.73-.51-15.647-.041-30.898 4.917-43.53 14.15-2.1 1.529-2.977 4.236-2.173 6.706 .804 2.47 3.106 4.143 5.703 4.144 1.269 .004 2.507-.399 3.53-1.15 17.321-12.594 39.914-15.358 59.76-7.31L203.56 220c2.231 2.452 6.028 2.631 8.48 .4 2.452-2.231 2.631-6.028 .4-8.48ZM235.81 88.55C205.399 63.644 167.308 50.024 128 50c-7.275 .003-14.543 .464-21.76 1.38-2.166 .225-4.039 1.605-4.896 3.607-.857 2.002-.562 4.31 .771 6.032 1.332 1.722 3.493 2.587 5.645 2.261C114.473 62.427 121.233 62 128 62c36.53 .019 71.928 12.675 100.19 35.82 1.655 1.372 3.917 1.754 5.931 1.002 2.014-.753 3.471-2.525 3.82-4.647 .349-2.121-.464-4.267-2.131-5.625ZM196.27 133.75c1.068 .824 2.382 1.264 3.73 1.25 2.553 0 4.826-1.615 5.666-4.025 .84-2.41 .063-5.088-1.936-6.675C188.842 112.519 171.415 104.367 152.83 100.49c-2.113-.47-4.316 .234-5.764 1.844-1.448 1.61-1.916 3.875-1.226 5.927 .691 2.052 2.433 3.573 4.56 3.979 16.755 3.503 32.462 10.869 45.87 21.51Z"),
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
        return _wifiSlash!!
    }

private var _wifiSlash: ImageVector? = null
