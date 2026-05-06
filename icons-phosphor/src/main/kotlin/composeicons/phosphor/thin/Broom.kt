package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Broom: ImageVector
    get() {
        if (_broom != null) return _broom!!
        _broom = phosphorThinIcon(
            name = "Broom",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M233.75 220.4C209.76 208.75 196 183.82 196 152v-17.28c.001-4.914-2.995-9.332-7.56-11.15l-24.89-9.83c-6.137-2.452-9.137-9.403-6.71-15.55L178.17 45.19c3.826-9.07 1.694-19.558-5.368-26.415-7.063-6.857-17.609-8.678-26.562-4.585-5.721 2.606-10.233 7.294-12.62 13.11L112.62 80.4c-1.173 2.968-3.48 5.347-6.412 6.61-2.931 1.263-6.245 1.306-9.208 .12L71.63 76.84c-4.488-1.79-9.611-.714-13 2.73C38.3 100.45 28 124.82 28 152c-.052 27.88 10.73 54.689 30.07 74.77 .765 .797 1.825 1.242 2.93 1.23h171c1.866 .003 3.486-1.284 3.904-3.102 .419-1.818-.475-3.684-2.154-4.498ZM64.34 85.15c1.12-1.142 2.819-1.494 4.3-.89L94 94.55c4.933 1.968 10.445 1.893 15.323-.208 4.877-2.101 8.719-6.055 10.677-10.992L141 30.35C144.39 22.19 153.61 18 161.58 21c4.08 1.517 7.366 4.631 9.1 8.623 1.734 3.993 1.766 8.52 .09 12.537L149.41 95.22c-1.969 4.93-1.897 10.441 .201 15.317 2.097 4.877 6.047 8.72 10.979 10.683l24.9 9.83c1.519 .61 2.513 2.083 2.51 3.72v17.23c0 2.36 .08 4.69 .22 7L49.72 103.6C53.925 96.948 58.826 90.764 64.34 85.15ZM113.56 220C100.477 207.919 91.211 192.278 86.9 175c-.552-2.14-2.735-3.427-4.875-2.875-2.14 .552-3.427 2.735-2.875 4.875 4.035 16.017 11.967 30.789 23.09 43h-39.56C45.487 201.536 35.951 177.229 36 152c-.135-14.382 3.203-28.584 9.73-41.4L189.13 168c3.22 22 13.23 40.09 28.8 52Z"),
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
        return _broom!!
    }

private var _broom: ImageVector? = null
