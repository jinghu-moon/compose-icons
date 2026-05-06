package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.FileJsx: ImageVector
    get() {
        if (_fileJsx != null) return _fileJsx!!
        _fileJsx = phosphorRegularIcon(
            name = "FileJsx",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M147.81 196.31c-.631 6.196-4.003 11.783-9.19 15.23C133.43 215 127 216 121.13 216c-5.128-.022-10.232-.694-15.19-2-4.255-1.19-6.74-5.605-5.55-9.86 1.19-4.255 5.605-6.74 9.86-5.55 4.38 1.21 15 2.71 19.55-.35 .88-.6 1.83-1.52 2.14-3.93 .34-2.67-.72-4.1-12.78-7.59-9.35-2.7-25-7.23-23-23.11 .634-6.072 3.931-11.548 9-14.95 11.85-8 30.72-3.31 32.84-2.76 4.275 1.124 6.829 5.5 5.705 9.775-1.124 4.275-5.5 6.829-9.775 5.705-4.49-1.17-15.23-2.56-19.83 .56-1.224 .825-1.97 2.194-2 3.67-.12 .9-.14 1.08 1.11 1.9 2.31 1.49 6.45 2.68 10.45 3.84 9.83 2.82 26.34 7.65 24.15 24.96ZM72 144c-4.418 0-8 3.582-8 8v38c0 5.523-4.477 10-10 10-5.523 0-10-4.477-10-10 0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8 0 14.359 11.641 26 26 26 14.359 0 26-11.641 26-26v-38c0-4.418-3.582-8-8-8ZM212.65 145.49c-1.727-1.233-3.872-1.73-5.965-1.381-2.093 .349-3.962 1.515-5.195 3.241L188 166.24 174.51 147.35c-2.643-3.366-7.466-4.056-10.947-1.566-3.48 2.49-4.385 7.278-2.053 10.866L178.17 180l-16.68 23.35c-2.332 3.588-1.427 8.376 2.053 10.866 3.48 2.49 8.304 1.8 10.947-1.566L188 193.76l13.49 18.89c2.643 3.366 7.466 4.056 10.947 1.566 3.48-2.49 4.385-7.278 2.053-10.866L197.83 180l16.68-23.35c1.233-1.727 1.73-3.872 1.381-5.965-.349-2.093-1.515-3.962-3.241-5.195ZM216 88v24c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-16h-48c-4.418 0-8-3.582-8-8v-48h-88v72c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-72C40 31.163 47.163 24 56 24h96c2.122-.002 4.158 .84 5.66 2.34l56 56c1.5 1.502 2.342 3.538 2.34 5.66ZM188.69 80 160 51.31v28.69Z"),
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
        return _fileJsx!!
    }

private var _fileJsx: ImageVector? = null
