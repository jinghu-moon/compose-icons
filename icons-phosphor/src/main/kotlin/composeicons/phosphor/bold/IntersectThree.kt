package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.IntersectThree: ImageVector
    get() {
        if (_intersectThree != null) return _intersectThree!!
        _intersectThree = phosphorBoldIcon(
            name = "IntersectThree",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M200 93.66c0-.55 0-1.1 0-1.66C200 52.235 167.764 20 128 20 88.235 20 56 52.235 56 92c0 .56 0 1.11 0 1.66C32.997 106.151 18.585 130.141 18.361 156.316c-.225 26.174 13.774 50.409 36.559 63.292 22.785 12.884 50.767 12.387 73.08-1.298 22.313 13.684 50.295 14.181 73.08 1.298 22.785-12.884 36.783-37.118 36.559-63.292C237.415 130.141 223.003 106.151 200 93.66ZM158.72 128.88C156.056 122.349 152.444 116.247 148 110.77c8.013-2.858 16.645-3.521 25-1.92-2.959 7.804-7.893 14.705-14.32 20.03ZM128 187.7c-6.123-6.925-10.107-15.477-11.47-24.62 7.598 1.226 15.342 1.226 22.94 0-1.363 9.143-5.347 17.695-11.47 24.62ZM83.06 108.85c8.355-1.601 16.987-.938 25 1.92-4.444 5.477-8.056 11.579-10.72 18.11C90.928 123.55 86.008 116.649 83.06 108.85ZM128 140c-3-.003-5.993-.287-8.94-.85 2.054-5.451 5.084-10.484 8.94-14.85 3.856 4.366 6.886 9.398 8.94 14.85-2.947 .563-5.94 .847-8.94 .85ZM128 44c23.762 .032 43.936 17.422 47.47 40.92C159.109 82.275 142.336 85.373 128 93.69 113.664 85.373 96.891 82.275 80.53 84.92 84.064 61.422 104.238 44.032 128 44ZM44 156c-.005-14.259 6.344-27.778 17.32-36.88 6.058 14.805 16.846 27.189 30.68 35.22 0 .55 0 1.1 0 1.66-.024 16.467 5.627 32.44 16 45.23-14.687 5.193-30.981 2.935-43.703-6.056C51.576 186.183 44.008 171.578 44 156ZM164 204c-5.452-.001-10.864-.938-16-2.77C158.373 188.44 164.024 172.467 164 156c0-.56 0-1.11 0-1.66 13.849-8.024 24.652-20.409 30.72-35.22 15.528 12.935 21.29 34.212 14.412 53.215C202.255 191.339 184.21 203.999 164 204Z"),
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
        return _intersectThree!!
    }

private var _intersectThree: ImageVector? = null
