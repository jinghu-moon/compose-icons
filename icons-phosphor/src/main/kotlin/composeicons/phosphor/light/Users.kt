package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Users: ImageVector
    get() {
        if (_users != null) return _users!!
        _users = phosphorLightIcon(
            name = "Users",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M112.6 158.43c22.912-12.987 34.198-39.781 27.483-65.247C133.368 67.717 110.337 49.972 84 49.972c-26.337 0-49.368 17.745-56.083 43.211-6.715 25.466 4.571 52.26 27.483 65.247C34.75 165.013 17.015 178.543 5.21 196.72c-1.811 2.775-1.03 6.493 1.745 8.305 2.775 1.811 6.494 1.03 8.305-1.745C30.388 180.02 56.253 165.988 84 165.988c27.747 0 53.612 14.032 68.74 37.292 1.921 2.462 5.41 3.039 8.021 1.326 2.611-1.713 3.472-5.143 1.979-7.886C150.947 178.552 133.232 165.024 112.6 158.43ZM38 108C38 82.595 58.595 62 84 62c25.405 0 46 20.595 46 46 0 25.405-20.595 46-46 46C58.609 153.967 38.033 133.391 38 108ZM249 205c-2.773 1.809-6.487 1.031-8.3-1.74C225.598 179.996 199.736 165.97 172 166c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6 18.525-.019 35.231-11.148 42.385-28.236 7.154-17.088 3.36-36.8-9.627-50.011C191.772 62.542 172.128 58.41 154.92 65.27c-1.994 .816-4.273 .501-5.97-.827-1.697-1.328-2.552-3.463-2.24-5.595 .312-2.132 1.744-3.933 3.75-4.718 28.319-11.29 60.544 1.271 73.753 28.747 13.209 27.476 2.891 60.488-23.613 75.553 20.65 6.583 38.385 20.113 50.19 38.29 1.786 2.782 .986 6.484-1.79 8.28Z"),
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
        return _users!!
    }

private var _users: ImageVector? = null
