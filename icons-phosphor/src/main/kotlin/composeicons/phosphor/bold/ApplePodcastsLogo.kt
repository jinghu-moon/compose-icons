package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ApplePodcastsLogo: ImageVector
    get() {
        if (_applePodcastsLogo != null) return _applePodcastsLogo!!
        _applePodcastsLogo = phosphorBoldIcon(
            name = "ApplePodcastsLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M161.36 130c11.05-16.702 8.045-39.003-7.032-52.184-15.077-13.182-37.579-13.182-52.656 0C86.595 90.997 83.59 113.298 94.64 130c-1.672 1.328-3.188 2.841-4.52 4.51-5.331 6.646-7.328 15.366-5.42 23.67l12.75 56c2.845 12.792 14.216 21.874 27.32 21.82h6.46c13.095 .057 24.463-9.01 27.32-21.79l12.75-56c1.908-8.304-.089-17.024-5.42-23.67-1.33-1.679-2.847-3.202-4.52-4.54ZM128 92c8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16ZM147.89 152.88l-12.74 56c-.413 1.831-2.043 3.128-3.92 3.12h-6.46c-1.877 .008-3.507-1.289-3.92-3.12l-12.74-56c-.279-1.182 .005-2.427 .77-3.37 .757-.951 1.905-1.507 3.12-1.51h32c1.226-.006 2.387 .551 3.15 1.51 .754 .949 1.028 2.193 .74 3.37ZM236 128c.006 31.651-13.887 61.708-38 82.21-5.069 3.706-12.139 2.878-16.213-1.9-4.075-4.778-3.777-11.89 .683-16.31 26.796-22.825 36.519-59.936 24.357-92.968C194.666 66.001 163.199 44.055 128 44.055c-35.199 0-66.666 21.946-78.827 54.978C37.011 132.064 46.734 169.175 73.53 192c4.46 4.42 4.758 11.532 .683 16.31-4.075 4.778-11.144 5.606-16.213 1.9C19.953 177.827 9.084 123.575 31.721 79.035 54.357 34.495 104.588 11.296 153.174 22.941 201.76 34.587 236.016 78.038 236 128Z"),
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
        return _applePodcastsLogo!!
    }

private var _applePodcastsLogo: ImageVector? = null
