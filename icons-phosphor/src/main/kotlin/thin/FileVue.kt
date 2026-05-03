package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FileVue: ImageVector
    get() {
        if (_fileVue != null) return _fileVue!!
        _fileVue = phosphorThinIcon(
            name = "FileVue",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 83.770 153.350 L 63.770 209.350 C 63.204 210.946 61.694 212.013 60.000 212.013 C 58.306 212.013 56.796 210.946 56.230 209.350 L 36.230 153.350 C 35.484 151.268 36.568 148.976 38.650 148.230 C 40.732 147.484 43.024 148.568 43.770 150.650 L 60.000 196.110 L 76.230 150.650 C 76.976 148.568 79.268 147.484 81.350 148.230 C 83.432 148.976 84.516 151.268 83.770 153.350 ZM 208.000 156.000 C 210.209 156.000 212.000 154.209 212.000 152.000 C 212.000 149.791 210.209 148.000 208.000 148.000 L 176.000 148.000 C 173.791 148.000 172.000 149.791 172.000 152.000 L 172.000 208.000 C 172.000 210.209 173.791 212.000 176.000 212.000 L 208.000 212.000 C 210.209 212.000 212.000 210.209 212.000 208.000 C 212.000 205.791 210.209 204.000 208.000 204.000 L 180.000 204.000 L 180.000 184.000 L 200.000 184.000 C 202.209 184.000 204.000 182.209 204.000 180.000 C 204.000 177.791 202.209 176.000 200.000 176.000 L 180.000 176.000 L 180.000 156.000 ZM 144.000 148.000 C 141.791 148.000 140.000 149.791 140.000 152.000 L 140.000 190.000 C 140.000 197.732 133.732 204.000 126.000 204.000 C 118.268 204.000 112.000 197.732 112.000 190.000 L 112.000 152.000 C 112.000 149.791 110.209 148.000 108.000 148.000 C 105.791 148.000 104.000 149.791 104.000 152.000 L 104.000 190.000 C 104.000 202.150 113.850 212.000 126.000 212.000 C 138.150 212.000 148.000 202.150 148.000 190.000 L 148.000 152.000 C 148.000 149.791 146.209 148.000 144.000 148.000 ZM 212.000 88.000 L 212.000 112.000 C 212.000 114.209 210.209 116.000 208.000 116.000 C 205.791 116.000 204.000 114.209 204.000 112.000 L 204.000 92.000 L 152.000 92.000 C 149.791 92.000 148.000 90.209 148.000 88.000 L 148.000 36.000 L 56.000 36.000 C 53.791 36.000 52.000 37.791 52.000 40.000 L 52.000 112.000 C 52.000 114.209 50.209 116.000 48.000 116.000 C 45.791 116.000 44.000 114.209 44.000 112.000 L 44.000 40.000 C 44.000 33.373 49.373 28.000 56.000 28.000 L 152.000 28.000 C 153.061 27.999 154.079 28.420 154.830 29.170 L 210.830 85.170 C 211.580 85.921 212.001 86.939 212.000 88.000 ZM 198.340 84.000 L 156.000 41.650 L 156.000 84.000 Z"),
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
        return _fileVue!!
    }

private var _fileVue: ImageVector? = null
