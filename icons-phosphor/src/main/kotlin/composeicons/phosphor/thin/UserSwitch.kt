package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.UserSwitch: ImageVector
    get() {
        if (_userSwitch != null) return _userSwitch!!
        _userSwitch = phosphorThinIcon(
            name = "UserSwitch",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M250.83 130.83l-24 24c-.75 .751-1.768 1.173-2.83 1.173-1.062 0-2.08-.422-2.83-1.173l-24-24c-1.563-1.563-1.563-4.097 0-5.66 1.563-1.563 4.097-1.563 5.66 0L220 142.34v-14.34C220.012 88.037 194.224 52.637 156.182 40.395 118.141 28.153 76.547 41.87 53.25 74.34c-1.292 1.795-3.795 2.202-5.59 .91-1.795-1.292-2.202-3.795-.91-5.59C72.074 34.365 117.288 19.456 158.64 32.766 199.991 46.076 228.019 84.56 228 128v14.34l17.17-17.17c1.563-1.563 4.097-1.563 5.66 0 1.563 1.563 1.563 4.097 0 5.66ZM209.23 186.34c-25.329 35.277-70.533 50.173-111.873 36.865C56.018 209.898 27.993 171.429 28 128v-14.34L10.83 130.83c-1.563 1.563-4.097 1.563-5.66 0-1.563-1.563-1.563-4.097 0-5.66l24-24c.75-.751 1.768-1.173 2.83-1.173 1.062 0 2.08 .422 2.83 1.173l24 24c1.563 1.563 1.563 4.097 0 5.66-1.563 1.563-4.097 1.563-5.66 0L36 113.66v14.34c-.016 24.326 9.635 47.662 26.83 64.87 9.937-16.613 25.868-28.783 44.51-34C89.505 149.385 80.42 128.975 85.307 109.376 90.195 89.776 107.8 76.022 128 76.022c20.2 0 37.805 13.754 42.693 33.354 4.888 19.6-4.198 40.01-22.033 49.494 18.659 5.229 34.597 17.425 44.52 34.07 3.485-3.483 6.682-7.242 9.56-11.24 1.292-1.792 3.793-2.197 5.585-.905 1.792 1.292 2.197 3.793 .905 5.585ZM128 156c19.882 0 36-16.118 36-36C164 100.118 147.882 84 128 84c-19.882 0-36 16.118-36 36 0 19.882 16.118 36 36 36ZM128 220c21.633-.032 42.566-7.667 59.14-21.57C175.059 177.15 152.476 164.002 128.005 164.002c-24.471 0-47.054 13.148-59.135 34.428C85.412 212.382 106.36 220.023 128 220Z"),
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
        return _userSwitch!!
    }

private var _userSwitch: ImageVector? = null
