package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.PinterestLogo: ImageVector
    get() {
        if (_pinterestLogo != null) return _pinterestLogo!!
        _pinterestLogo = phosphorFillIcon(
            name = "PinterestLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M240 128.7c-.38 56.49-46.46 102.73-102.94 103.29-8.738 .092-17.453-.916-25.94-3-1.031-.257-1.918-.914-2.463-1.826-.546-.912-.707-2.003-.447-3.034l8.64-34.55c8.427 4.223 17.724 6.422 27.15 6.42 37 0 66.7-33.45 63.81-73.36C205.668 94.34 187.102 69.938 160.398 60.327 133.694 50.716 103.835 57.689 84.15 78.133 64.465 98.578 58.626 128.679 69.24 155c.816 2.031 2.428 3.639 4.461 4.45 2.033 .811 4.31 .753 6.299-.16 3.897-1.889 5.65-6.486 4-10.49C75.832 128.316 80.446 104.945 95.786 89.103 111.126 73.26 134.336 67.895 155.073 75.399c20.737 7.504 35.138 26.48 36.787 48.471C194 154.4 171.73 180 144 180c-8.155-.004-16.155-2.23-23.14-6.44l14.9-59.62c.986-4.252-1.618-8.509-5.853-9.568-4.234-1.059-8.536 1.472-9.667 5.688L93.38 217.51c-.295 1.185-1.116 2.171-2.229 2.675-1.113 .505-2.395 .473-3.481-.085C53.078 201.948 31.576 165.943 32 126.88 32.6 70.52 78.67 24.52 135 24c27.877-.269 54.695 10.666 74.436 30.351 19.741 19.685 30.753 46.471 30.564 74.349Z"),
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
        return _pinterestLogo!!
    }

private var _pinterestLogo: ImageVector? = null
