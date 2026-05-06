package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.PersonSimpleThrow: ImageVector
    get() {
        if (_personSimpleThrow != null) return _personSimpleThrow!!
        _personSimpleThrow = phosphorRegularIcon(
            name = "PersonSimpleThrow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 88c17.673 0 32-14.327 32-32C160 38.327 145.673 24 128 24 110.327 24 96 38.327 96 56c0 17.673 14.327 32 32 32ZM128 40c8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16ZM48 96C48 87.163 55.163 80 64 80c8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16C55.163 112 48 104.837 48 96ZM222.24 110.61c-2.757 3.451-7.788 4.015-11.24 1.26-1.15-.89-23.71-17.7-59.32 .61-.28 10.175-1.283 20.317-3 30.35l32.43 27c2.532 2.108 3.513 5.554 2.47 8.68l-16 48c-1.397 4.192-5.928 6.457-10.12 5.06-4.192-1.397-6.457-5.928-5.06-10.12l14.27-42.82L144.59 160.23c-1.443 4.864-3.145 9.648-5.1 14.33-13.75 32.74-38.38 54.63-73.2 65.08-4.19 1.153-8.535-1.25-9.784-5.413-1.25-4.162 1.052-8.561 5.184-9.907 60.68-18.21 71.14-72.22 73.42-101.65C108 139.88 86.57 144 72.36 144c-6.694 .023-13.344-1.083-19.67-3.27-3.489-1.525-5.42-5.297-4.617-9.019 .804-3.722 4.119-6.362 7.927-6.311 1.143-.002 2.273 .248 3.31 .73 0 0 26.76 10.68 72.19-20.2 52.29-35.54 88-7.77 89.51-6.57 1.656 1.328 2.715 3.26 2.946 5.37 .231 2.11-.387 4.225-1.716 5.88Z"),
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
        return _personSimpleThrow!!
    }

private var _personSimpleThrow: ImageVector? = null
