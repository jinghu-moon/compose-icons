package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Broom: ImageVector
    get() {
        if (_broom != null) return _broom!!
        _broom = phosphorBoldIcon(
            name = "Broom",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M237.24 213.21C216.12 203 204 180.64 204 152v-17.27c.017-8.203-4.99-15.579-12.62-18.59l-24.86-9.81c-2.031-.808-3.038-3.097-2.26-5.14L185.59 48.19c3.309-8.025 3.217-17.049-.256-25.004C181.861 15.231 175.305 9.028 167.17 6 150.852-.005 132.719 8.061 126.25 24.2l-.07 .18-21 53.09c-.387 .992-1.159 1.786-2.14 2.2-.952 .42-2.032 .442-3 .06L74.6 69.43C67.101 66.392 58.51 68.199 52.87 74 31.06 96.43 20 122.68 20 152c-.055 29.941 11.522 58.733 32.29 80.3 2.274 2.374 5.422 3.712 8.71 3.7h171c5.587-.005 10.432-3.866 11.684-9.311 1.252-5.445-1.42-11.034-6.444-13.479ZM68.19 92.73 91.06 102c6.912 2.767 14.641 2.667 21.478-.277 6.838-2.944 12.222-8.49 14.962-15.413L148.45 33.31c1.633-4.08 6.157-6.186 10.33-4.81 2.04 .756 3.685 2.31 4.555 4.304 .87 1.994 .89 4.257 .055 6.266-.002 .037-.002 .073 0 .11L142 92.29c-5.661 14.362 1.347 30.598 15.68 36.33L180 137.45v14.55c0 1 0 2.07 .05 3.1L57.61 106.1c3.147-4.744 6.686-9.217 10.58-13.37ZM116.74 212C105.969 201.249 98.332 187.766 94.65 173c-1.657-6.42-8.205-10.282-14.625-8.625-6.42 1.657-10.282 8.205-8.625 14.625 2.988 11.72 7.883 22.869 14.49 33h-19.64C51.856 195.329 43.956 174.026 44 152c-.04-8.16 1.108-16.282 3.41-24.11l136.67 54.66c2.935 10.657 7.885 20.654 14.58 29.45Z"),
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
