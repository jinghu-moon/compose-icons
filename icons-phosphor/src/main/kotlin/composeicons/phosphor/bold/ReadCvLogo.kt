package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ReadCvLogo: ImageVector
    get() {
        if (_readCvLogo != null) return _readCvLogo!!
        _readCvLogo = phosphorBoldIcon(
            name = "ReadCvLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M211.48 35.32 81.23 12.32c-5.225-.924-10.603 .265-14.95 3.308-4.347 3.042-7.308 7.687-8.23 12.912L28.3 197.54c-1.913 10.874 5.348 21.24 16.22 23.16l130.25 23h0c1.162 .206 2.34 .31 3.52 .31 9.718 .005 18.034-6.977 19.71-16.55L227.75 58.46c.912-5.226-.29-10.6-3.342-14.94-3.051-4.34-7.702-7.289-12.928-8.2ZM175 219.36 52.63 197.75 81 36.64 203.37 58.25ZM91.9 67c1.153-6.524 7.375-10.88 13.9-9.73L173 69.14c6.236 .956 10.666 6.577 10.139 12.864C182.612 88.29 177.308 93.095 171 93c-.704-.001-1.406-.061-2.1-.18L101.63 80.9C95.106 79.747 90.75 73.525 91.9 67ZM85 106.39c.553-3.135 2.33-5.922 4.939-7.747 2.609-1.825 5.836-2.538 8.971-1.983l67.22 11.88c6.116 1.101 10.379 6.69 9.825 12.879-.554 6.19-5.741 10.932-11.955 10.931-.704-.001-1.406-.061-2.1-.18L94.69 120.29C88.182 119.118 83.848 112.902 85 106.39ZM78 145.78c1.153-6.524 7.375-10.88 13.9-9.73L125.54 142c6.131 1.074 10.423 6.658 9.884 12.859-.539 6.201-5.73 10.961-11.954 10.961-.704 0-1.407-.063-2.1-.19L87.76 159.7c-3.143-.546-5.939-2.322-7.77-4.934C78.158 152.155 77.442 148.921 78 145.78Z"),
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
        return _readCvLogo!!
    }

private var _readCvLogo: ImageVector? = null
