package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.DribbbleLogo: ImageVector
    get() {
        if (_dribbbleLogo != null) return _dribbbleLogo!!
        _dribbbleLogo = phosphorFillIcon(
            name = "DribbbleLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M93.27 36.86c-1.317-.815-2.045-2.316-1.87-3.855 .175-1.539 1.223-2.838 2.69-3.335 29.546-10.18 62.105-6.526 88.66 9.95 .961 .606 1.619 1.592 1.81 2.712 .191 1.12-.104 2.268-.81 3.158C172.172 60.286 157.972 72.827 141.86 82.49 128.845 64.213 112.328 48.703 93.27 36.86ZM127.58 90C112.975 70.071 93.761 53.976 71.58 43.09c-1.294-.628-2.827-.502-4 .33C49.624 56.264 36.201 74.469 29.24 95.42c-.354 1.084-.228 2.266 .344 3.252 .573 .985 1.539 1.68 2.656 1.908C42.678 102.83 53.323 103.976 64 104c21.959 .012 43.657-4.766 63.58-14ZM231.38 116.69C228.837 93.495 218.554 71.834 202.19 55.2c-.807-.82-1.928-1.253-3.077-1.188-1.149 .065-2.214 .622-2.923 1.528C183.534 71.664 168.052 85.353 150.5 95.94c5.483 9.5 10.022 19.514 13.55 29.9C178.377 121.956 193.156 119.992 208 120c6.348 0 12.692 .357 19 1.07 1.189 .119 2.368-.3 3.216-1.142 .848-.842 1.275-2.018 1.164-3.208ZM168.47 141.19c2.964 12.608 4.457 25.518 4.45 38.47-.006 12.397-1.385 24.756-4.11 36.85-.356 1.512 .196 3.094 1.416 4.056 1.22 .962 2.886 1.132 4.274 .434 30.793-15.447 51.966-45.109 56.57-79.25 .138-1.059-.153-2.13-.808-2.973-.656-.843-1.621-1.39-2.682-1.517-19.775-2.545-39.858-1.186-59.11 4ZM148.83 130.74c-3.224-9.456-7.374-18.57-12.39-27.21C113.836 114.389 89.077 120.018 64 120c-11.722 .001-23.412-1.223-34.88-3.65-1.119-.236-2.286 .018-3.205 .699-.919 .68-1.503 1.722-1.605 2.861q-.31 4-.32 8.09c-.011 28.786 11.943 56.282 33 75.91 .89 .816 2.101 1.186 3.294 1.007 1.194-.179 2.243-.887 2.856-1.927 19.518-33.119 49.744-58.593 85.69-72.22ZM75.69 213.25c-.531 .927-.669 2.028-.384 3.057 .286 1.029 .971 1.902 1.904 2.423 20.913 11.725 45.239 15.856 68.85 11.69 1.431-.25 2.608-1.269 3.06-2.65 5.158-15.506 7.791-31.739 7.8-48.08 .002-11.258-1.252-22.481-3.74-33.46-32.767 12.767-60.133 36.436-77.49 67.02Z"),
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
        return _dribbbleLogo!!
    }

private var _dribbbleLogo: ImageVector? = null
