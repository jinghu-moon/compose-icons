package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.NumberFive: ImageVector
    get() {
        if (_numberFive != null) return _numberFive!!
        _numberFive = phosphorRegularIcon(
            name = "NumberFive",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M176 160c-.001 22.082-12.979 42.102-33.137 51.118-20.158 9.015-43.732 5.343-60.193-9.378-2.24-1.874-3.281-4.821-2.715-7.686 .566-2.866 2.649-5.195 5.434-6.076 2.785-.882 5.829-.175 7.941 1.843 15.937 14.255 40.267 13.455 55.233-1.816 14.967-15.27 15.277-39.611 .706-55.259C134.697 117.098 110.396 115.677 94.1 129.52c-2.596 2.184-6.288 2.492-9.21 .77-2.923-1.722-4.442-5.101-3.79-8.43L96.16 46.43C96.908 42.693 100.189 40.002 104 40h64c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-57.44l-10.32 51.6c17.203-6.487 36.494-4.117 51.616 6.341C166.977 124.4 176.001 141.614 176 160Z"),
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
        return _numberFive!!
    }

private var _numberFive: ImageVector? = null
