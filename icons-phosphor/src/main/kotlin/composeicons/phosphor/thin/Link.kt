package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Link: ImageVector
    get() {
        if (_link != null) return _link!!
        _link = phosphorThinIcon(
            name = "Link",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M236 88.12c-.362 12.911-5.663 25.191-14.81 34.31l-34.75 34.74c-9.481 9.528-22.379 14.868-35.82 14.83h-.05c-13.658-.011-26.733-5.54-36.255-15.332C104.793 146.877 99.63 133.653 100 120c.06-2.166 1.833-3.891 4-3.89h.11c1.061 .029 2.067 .478 2.797 1.249 .73 .771 1.123 1.8 1.093 2.861-.307 11.495 4.041 22.626 12.058 30.869 8.017 8.243 19.024 12.899 30.522 12.911h0c11.312 .032 22.166-4.466 30.14-12.49l34.75-34.74c10.945-10.734 15.285-26.518 11.364-41.339C222.914 60.611 211.338 49.037 196.517 45.119c-14.821-3.918-30.605 .424-41.337 11.371l-11 11c-1.571 1.496-4.048 1.466-5.584-.067-1.535-1.533-1.569-4.01-.076-5.583l11-11C164.187 36.128 186.352 31.866 205.43 40.09c19.077 8.224 31.197 27.265 30.57 48.03ZM111.78 188.49l-11 11C92.799 207.531 81.929 212.037 70.6 212h0C53.366 211.985 37.836 201.594 31.247 185.669c-6.589-15.925-2.942-34.251 9.243-46.439L75.24 104.49C87.585 92.143 106.21 88.572 122.246 95.477c16.036 6.905 26.241 22.89 25.754 40.343-.064 2.209 1.676 4.051 3.885 4.115 2.209 .064 4.051-1.676 4.115-3.885 .588-20.741-11.536-39.742-30.594-47.947C106.348 79.898 84.213 84.149 69.55 98.83L34.8 133.57C20.326 148.045 15.992 169.811 23.818 188.727c7.826 18.915 26.272 31.257 46.742 31.273h0c13.438 .035 26.332-5.304 35.81-14.83l11-11c1.055-1 1.484-2.494 1.121-3.901-.363-1.407-1.461-2.507-2.868-2.873-1.407-.365-2.901 .061-3.903 1.114Z"),
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
        return _link!!
    }

private var _link: ImageVector? = null
