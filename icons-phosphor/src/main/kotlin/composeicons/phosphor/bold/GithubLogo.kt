package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.GithubLogo: ImageVector
    get() {
        if (_githubLogo != null) return _githubLogo!!
        _githubLogo = phosphorBoldIcon(
            name = "GithubLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M212.62 75.17C217.266 58.611 215.019 40.877 206.39 26 204.247 22.288 200.286 20.001 196 20c-19.457-.055-37.873 8.785-50 24h-20C113.873 28.785 95.457 19.945 76 20c-4.286 .001-8.247 2.288-10.39 6C56.981 40.877 54.734 58.611 59.38 75.17 54.597 84.031 52.063 93.931 52 104v8c.039 27.637 18.921 51.686 45.76 58.28C93.978 176.893 91.992 184.381 92 192v4h-16C64.954 196 56 187.046 56 176 55.972 151.711 36.289 132.028 12 132c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12 11.046 0 20 8.954 20 20 .028 24.289 19.711 43.972 44 44h16v12c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-40c0-11.046 8.954-20 20-20 11.046 0 20 8.954 20 20v40c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-40c.008-7.619-1.978-15.107-5.76-21.72C201.079 163.686 219.961 139.637 220 112v-8c-.063-10.069-2.597-19.969-7.38-28.83ZM196 112c0 19.882-16.118 36-36 36h-48C92.118 148 76 131.882 76 112v-8c.103-7.151 2.228-14.127 6.13-20.12 2.531-3.277 3.133-7.651 1.58-11.49C80.268 63.495 80.126 53.661 83.31 44.67c10.894 2.007 20.462 8.456 26.41 17.8 2.205 3.444 6.011 5.528 10.1 5.53h32.35c4.092 .001 7.903-2.083 10.11-5.53 5.946-9.347 15.515-15.796 26.41-17.8 3.184 8.991 3.042 18.825-.4 27.72-1.488 3.864-.88 8.222 1.61 11.53 3.885 5.985 6 12.946 6.1 20.08Z"),
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
        return _githubLogo!!
    }

private var _githubLogo: ImageVector? = null
