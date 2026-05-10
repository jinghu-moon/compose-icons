package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Radioactive: ImageVector
    get() {
        if (_radioactive != null) return _radioactive!!
        _radioactive = phosphorFillIcon(
            name = "Radioactive",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M116 128c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12ZM100.22 131.51c-.144-1.164-.218-2.337-.22-3.51-.003-11.191 6.659-21.309 16.94-25.73 1.043-.455 1.843-1.332 2.2-2.412 .357-1.08 .237-2.261-.33-3.248L90.75 48C88.502 44.101 84.715 41.33 80.319 40.365c-4.396-.965-8.995-.034-12.669 2.565C42.753 60.482 26.819 88.082 24.07 118.42c-.405 4.526 1.108 9.013 4.17 12.37 3.019 3.305 7.284 5.195 11.76 5.21h56.26c1.145-.003 2.233-.496 2.99-1.354 .757-.858 1.11-2 .97-3.136ZM231.93 118.42C229.18 88.082 213.247 60.482 188.35 42.93c-3.674-2.599-8.273-3.53-12.669-2.565-4.396 .965-8.182 3.736-10.431 7.635L137.19 96.61c-.567 .986-.687 2.168-.33 3.248 .357 1.08 1.157 1.958 2.2 2.412 10.281 4.421 16.943 14.539 16.94 25.73-.002 1.173-.076 2.346-.22 3.51-.141 1.143 .217 2.291 .983 3.151 .766 .86 1.865 1.348 3.017 1.339h56.22c4.476-.015 8.741-1.905 11.76-5.21 3.062-3.357 4.575-7.844 4.17-12.37ZM150.8 151.48c-.58-.997-1.562-1.696-2.694-1.916-1.132-.22-2.305 .059-3.216 .766-9.992 7.557-23.788 7.557-33.78 0-.911-.707-2.084-.986-3.216-.766-1.132 .22-2.114 .919-2.694 1.916L77.25 199.91c-2.248 3.89-2.757 8.545-1.403 12.829 1.354 4.284 4.447 7.8 8.523 9.691 27.687 12.76 59.573 12.76 87.26 0 4.075-1.891 7.168-5.407 8.523-9.691 1.354-4.284 .845-8.939-1.403-12.829Z"),
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
        return _radioactive!!
    }

private var _radioactive: ImageVector? = null
