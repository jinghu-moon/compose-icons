package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandGithubCopilot: ImageVector
    get() {
        if (_brandGithubCopilot != null) return _brandGithubCopilot!!
        _brandGithubCopilot = tablerOutlineIcon(
            name = "BrandGithubCopilot",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 18v-5.5c0-.667 .167-1.333 .5-2")
            addPathData("M12 7.5C12 6.5 11.99 3.43 8 4 4.5 4.5 4 6.5 4 7.5c0 1.5 0 4 3 4 4 0 5-2.5 5-4")
            addPathData("M4 12c-1.333 .667-2 1.333-2 2 0 1 0 3 1.5 4 3 2 6.5 3 8.5 3 2 0 5.499-1 8.5-3C22 17 22 15 22 14c0-.667-.667-1.333-2-2")
            addPathData("M20 18v-5.5c0-.667-.167-1.333-.5-2")
            addPathData("M12 7.5v-.297l.01-.269 .027-.298 .013-.105 .033-.215c.014-.073 .029-.146 .046-.22l.06-.223C12.525 4.755 13.451 3.636 15.997 4c2.838 .405 3.703 1.797 3.93 2.842l.036 .204c0 .033 .01 .066 .013 .098l.016 .185v.171 .49l-.015 .394-.02 .271c-.122 1.366-.655 2.845-2.962 2.845-3.256 0-4.524-1.656-4.883-3.081l-.053-.242c-.014-.078-.026-.156-.036-.235l-.021-.227c-.005-.072-.007-.143-.007-.215h.005")
            addPathData("M10 15v2")
            addPathData("M14 15v2")
        }
        return _brandGithubCopilot!!
    }

private var _brandGithubCopilot: ImageVector? = null
